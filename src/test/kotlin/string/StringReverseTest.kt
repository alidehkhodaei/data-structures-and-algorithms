package string

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

/**
 * The StringReverseTest class contains test cases for the reverseString
 * function, which tests the ability to reverse a given string.
 */
class StringReverseTest {

    @ParameterizedTest
    @CsvSource(
        "Kotlin, niltoK",
        "a, a",
        "Kotlin is awesome, emosewa si niltoK",
        "'', ''"
    )
    fun `test reverseString function`(input: String, expected: String) {
        val actual = reverseString(input)
        assertEquals(expected, actual)
    }

}