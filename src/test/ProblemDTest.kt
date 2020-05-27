package test

import org.junit.Rule
import org.junit.Test
import problem_d.ProblemD
import kotlin.test.assertEquals

class ProblemDTest {
    @get:Rule
    val streamTestRule = StreamTestRule()

    @Test
    fun testProblemD() {
        val input = with(StringBuilder()) {
            appendln("7")
            appendln("11")
            appendln("3 1 4 1 5 9 2 6 5 3 5")
            appendln("1")
            appendln("1000")
            appendln("3")
            appendln("1 1 1")
            appendln("13")
            appendln("1 2 3 4 5 6 7 8 9 10 11 12 13")
            appendln("2")
            appendln("2 1")
            appendln("6")
            appendln("1 1 1 1 1 1")
            appendln("7")
            appendln("1 1 1 1 1 1 1")
        }.toString()

        val output = with(StringBuilder()) {
            appendln("6 23 21")
            appendln("1 1000 0")
            appendln("2 1 2")
            appendln("6 45 46")
            appendln("2 2 1")
            appendln("3 4 2")
            appendln("4 4 3")
        }.toString()

        System.setIn(input.byteInputStream())
        ProblemD.invoke()
        assertEquals(output, streamTestRule.outputStream.toString())
    }
}