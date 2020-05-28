package test

import org.junit.Rule
import org.junit.Test
import problem_e.ProblemE
import kotlin.test.assertEquals

class ProblemETest {
    @get:Rule
    val streamTestRule = StreamTestRule()

    @Test
    fun testProblemE() {
        val input = with(StringBuilder()) {
            appendln("6")
            appendln("10")
            appendln("2")
            appendln("4")
            appendln("6")
            appendln("7")
            appendln("13")
        }.toString()

        val output = with(StringBuilder()) {
            appendln("1 4 2 6 3 5 8 10 7 9")
            appendln("-1")
            appendln("2 4 1 3")
            appendln("1 4 2 6 3 5")
            appendln("1 3 5 2 6 4 7")
            appendln("2 4 1 3 5 7 9 6 8 11 13 10 12")
        }.toString()

        System.setIn(input.byteInputStream())
        ProblemE.invoke()
        assertEquals(output, streamTestRule.outputStream.toString())
    }
}