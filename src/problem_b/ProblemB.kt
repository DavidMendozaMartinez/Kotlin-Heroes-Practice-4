package problem_b

object ProblemB {
    fun invoke() = main()
}

fun main() {
    val count = readLine()!!.toInt()

    repeat(count) {
        val firstPart = readLine()!!.split(' ').map(String::toInt)
        val secondPart = readLine()!!.split(' ').map(String::toInt)

        println(if (isSquarePossible(firstPart, secondPart)) "Yes" else "No")
    }
}

fun isSquarePossible(firstPart: List<Int>, secondPart: List<Int>): Boolean =
        firstPart.max() == secondPart.max() && firstPart.min()!! + secondPart.min()!! == firstPart.max()