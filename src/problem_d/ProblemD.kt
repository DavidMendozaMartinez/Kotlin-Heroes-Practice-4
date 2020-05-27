package problem_d

object ProblemD {
    fun invoke() = main()
}

fun main() {
    val count = readLine()!!.toInt()

    repeat(count) {
        readLine()
        val candies = readLine()!!.split(' ').map(String::toInt).toMutableList()
        val sizesPerMove = mutableListOf<Int>()

        playGame(candies, sizesPerMove)

        val aliceCandySizes = sizesPerMove.filterIndexed { index, _ -> index % 2 == 0 }.sum()
        val bobCandySizes = sizesPerMove.sum() - aliceCandySizes

        println("${sizesPerMove.size} $aliceCandySizes $bobCandySizes")
    }
}

fun playGame(candies: MutableList<Int>, sizesPerMove: MutableList<Int>) {
    var previousSize = candies.removeAt(0)
    sizesPerMove.add(previousSize)

    while (candies.isNotEmpty()) {
        candies.reverse()
        previousSize = getSizeOfCandiesEaten(candies, previousSize)
        sizesPerMove.add(previousSize)
    }
}

fun getSizeOfCandiesEaten(candies: MutableList<Int>, previousSize: Int): Int {
    var size = 0

    while (size <= previousSize && candies.isNotEmpty())
        size += candies.removeAt(0)

    return size
}