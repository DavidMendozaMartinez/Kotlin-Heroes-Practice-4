package problem_c

import kotlin.math.pow

object ProblemC {
    fun invoke() = main()
}

fun main() {
    val count = readLine()!!.toInt()

    repeat(count) {
        val number = readLine()!!
        val summands = getSummands(number)

        println(summands.size)
        println(summands.joinToString(" "))
    }
}

fun getSummands(number: String): List<Int> = number.mapIndexed { index, char ->
    (Character.getNumericValue(char) * 10f.pow(number.length - index - 1)).toInt()
}.filter { it != 0 }