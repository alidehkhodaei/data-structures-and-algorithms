package array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 *  The ArrayReverseTest class contains test cases for the reverseArray function that reverses elements in an array.
 */
class ArrayReverseTest {

    @Test
    fun testReverseArray() {
        // Test case 1
        val arr1 = arrayOf(1, 2, 3, 4, 5)
        val result1 = reverseArray(arr1, 0, arr1.size - 1)
        val expected1 = arrayOf(5, 4, 3, 2, 1)
        assertArrayEquals(expected1, result1)

        // Test case 2
        val arr2 = arrayOf("Ali", "Shabnam", "Reza", "Fatemeh")
        val result2 = reverseArray(arr2, 1, 2)
        val expected2 = arrayOf("Ali", "Reza", "Shabnam", "Fatemeh")
        assertArrayEquals(expected2, result2)

        // Test case 3
        val arr3 = arrayOf(5.5, 4.4, 3.3, 2.2, 1.1)
        val result3 = reverseArray(arr3, 2, 4)
        val expected3 = arrayOf(5.5, 4.4, 1.1, 2.2, 3.3)
        assertArrayEquals(expected3, result3)
    }

}