package array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 *  The ArrayReverseTest class contains test cases for the reverseArray function that reverses elements in an array.
 */
class ArrayReverseTest {

    @Test
    fun `reverseArray should correctly reverse the entire array`() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        val result = reverseArray(arr, 0, arr.size - 1)
        val expected = arrayOf(5, 4, 3, 2, 1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `reverseArray should correctly reverse a subset of the array`() {
        val arr = arrayOf("Ali", "Shabnam", "Reza", "Fatemeh")
        val result = reverseArray(arr, 1, 2)
        val expected = arrayOf("Ali", "Reza", "Shabnam", "Fatemeh")
        assertArrayEquals(expected, result)
    }

    @Test
    fun `reverseArray should correctly reverse a subset of the array with decimal values`() {
        val arr = arrayOf(5.5, 4.4, 3.3, 2.2, 1.1)
        val result = reverseArray(arr, 2, 4)
        val expected = arrayOf(5.5, 4.4, 1.1, 2.2, 3.3)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `reverseArray should correctly handle a single element array`() {
        val arr = arrayOf(1)
        val result = reverseArray(arr, 0, arr.size - 1)
        val expected = arrayOf(1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `reverseArray should correctly handle an empty array`() {
        val arr = emptyArray<Int>()
        val result = reverseArray(arr, 0, arr.size - 1)
        val expected = emptyArray<Int>()
        assertArrayEquals(expected, result)
    }

    @Test
    fun `reverseArray when start and end are equal`() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val start = 2
        val end = 2
        val reversedArray = reverseArray(array, start, end)
        assertArrayEquals(array, reversedArray)
    }

    @Test
    fun `reverseArray should throw ArrayIndexOutOfBoundsException if startIndex is less than 0`() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        assertThrows<ArrayIndexOutOfBoundsException> { reverseArray(arr, -1, 3) }
    }

    @Test
    fun `reverseArray should throw ArrayIndexOutOfBoundsException if endIndex is greater than the array size minus 1`() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        assertThrows<ArrayIndexOutOfBoundsException> { reverseArray(arr, 2, 5) }
    }

    @Test
    fun `reverseArray should throw ArrayIndexOutOfBoundsException if startIndex is greater than endIndex`() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        assertThrows<IllegalArgumentException> { reverseArray(arr, 3, 2) }
    }

}