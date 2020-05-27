package test

import org.junit.rules.TestWatcher
import org.junit.runner.Description
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class StreamTestRule : TestWatcher() {
    val outputStream = ByteArrayOutputStream()

    override fun starting(description: Description?) {
        super.starting(description)
        System.setOut(PrintStream(outputStream))
    }

    override fun finished(description: Description?) {
        super.finished(description)
        System.setIn(System.`in`)
        System.setOut(System.out)
    }
}