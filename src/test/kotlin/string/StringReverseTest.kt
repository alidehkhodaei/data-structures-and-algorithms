package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * The StringReverseTest class contains test cases for the reverseString function, which tests the ability to reverse a
 * given string.
 */
class StringReverseTest {

    @Test
    fun testReverseString() {

        // Test case 1
        assertEquals("Shabnam", reverseString("manbahS"))

        // Test case 2
        assertEquals("a", reverseString("a"))

        // Test case 3
        assertEquals("", reverseString(""))

        // Test case 4
        assertEquals("Ali and Hasan", reverseString("nasaH dna ilA"))
    }

}