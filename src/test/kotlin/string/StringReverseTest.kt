package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * The StringReverseTest class contains test cases for the reverseString function, which tests the ability to reverse a
 * given string.
 */
class StringReverseTest {

    @Test
    fun `testReverseString should return the reversed string for valid input`() {
        val expected = "Shabnam"
        val actual = reverseString("manbahS")
        assertEquals(expected, actual)
    }

    @Test
    fun `testReverseString should return the same string for valid input with a single character`() {
        val expected = "a"
        val actual = reverseString("a")
        assertEquals(expected, actual)
    }

    @Test
    fun `testReverseString should return an empty string for empty input`() {
        val expected = ""
        val actual = reverseString("")
        assertEquals(expected, actual)
    }

}