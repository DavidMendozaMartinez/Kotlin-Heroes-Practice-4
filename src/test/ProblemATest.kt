package test

import org.junit.Rule
import org.junit.Test
import problem_a.ProblemA
import kotlin.test.assertEquals

class ProblemATest {
    @get:Rule
    val streamTestRule = StreamTestRule()

    @Test
    fun testProblemA() {
        val input = with(StringBuilder()) {
            appendln("4")
            appendln("1 5")
            appendln("314 15")
            appendln("-99 99")
            appendln("123 987")
        }.toString()

        val output = with(StringBuilder()) {
            appendln("6")
            appendln("329")
            appendln("0")
            appendln("1110")
        }.toString()

        System.setIn(input.byteInputStream())
        ProblemA.invoke()
        assertEquals(output, streamTestRule.outputStream.toString())
    }
}