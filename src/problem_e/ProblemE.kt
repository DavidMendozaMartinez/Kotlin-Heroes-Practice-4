package problem_e

object ProblemE {
    fun invoke() = main()
}

fun main() {
    val count = readLine()!!.toInt()

    repeat(count) {
        when (val number = readLine()!!.toInt()) {
            2, 3 -> println("-1")
            else -> println(getPermutation(number).joinToString(" "))
        }
    }
}

fun getPermutation(number: Int): MutableList<Int> {
    val permutation = mutableListOf<Int>()

    when (number % 4) {
        0 -> permutation.addAll(listOf(2, 4, 1, 3))
        1 -> permutation.addAll(listOf(2, 4, 1, 3, 5))
        2 -> permutation.addAll(listOf(1, 4, 2, 6, 3, 5))
        3 -> permutation.addAll(listOf(1, 3, 5, 2, 6, 4, 7))
    }

    ((permutation.max()!! + 4)..number step 4).map { permutation.addAll(listOf(it - 2, it, it - 3, it - 1)) }

    return permutation
}