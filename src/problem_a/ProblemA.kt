package problem_a

object ProblemA {
    fun invoke() = main()
}

fun main() {
    val count = readLine()!!.toInt()

    repeat(count) {
        println((readLine()!!.split(' ').map(String::toInt)).sum())
    }
}