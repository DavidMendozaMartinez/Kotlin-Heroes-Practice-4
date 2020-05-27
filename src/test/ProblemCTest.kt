package test

import org.junit.Rule
import org.junit.Test
import problem_c.ProblemC
import kotlin.test.assertEquals

class ProblemCTest {
    @get:Rule
    val streamTestRule = StreamTestRule()

    @Test
    fun testProblemC() {
        val input = with(StringBuilder()) {
            appendln("5")
            appendln("5009")
            appendln("7")
            appendln("9876")
            appendln("10000")
            appendln("10")
        }.toString()

        val output = with(StringBuilder()) {
            appendln("2")
            appendln("5000 9")
            appendln("1")
            appendln("7")
            appendln("4")
            appendln("9000 800 70 6")
            appendln("1")
            appendln("10000")
            appendln("1")
            appendln("10")
        }.toString()

        System.setIn(input.byteInputStream())
        ProblemC.invoke()
        assertEquals(output, streamTestRule.outputStream.toString())
    }
}