package test

import org.junit.Rule
import org.junit.Test
import problem_b.ProblemB
import kotlin.test.assertEquals

class ProblemBTest {
    @get:Rule
    val streamTestRule = StreamTestRule()

    @Test
    fun testProblemB() {
        val input = with(StringBuilder()) {
            appendln("3")
            appendln("2 3")
            appendln("3 1")
            appendln("3 2")
            appendln("1 3")
            appendln("3 3")
            appendln("1 3")
        }.toString()

        val output = with(StringBuilder()) {
            appendln("Yes")
            appendln("Yes")
            appendln("No")
        }.toString()

        System.setIn(input.byteInputStream())
        ProblemB.invoke()
        assertEquals(output, streamTestRule.outputStream.toString())
    }
}