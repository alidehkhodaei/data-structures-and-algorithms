package array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


/**
 *  The ArrayRotateTest class contains test cases for the rotateArrayLeftByOne and rotateArrayRightByOne functions,
 *  which rotate the elements of an array to the left and right by one position, respectively.
 */
class ArrayRotateTest {

    @Test
    fun `rotateArrayLeftByOne should rotate an array of integers to the left by one position`() {
        val arr1 = arrayOf(1, 2, 3, 4, 5)
        rotateArrayLeftByOne(arr1)
        assertArrayEquals(arrayOf(2, 3, 4, 5, 1), arr1)
    }

    @Test
    fun `rotateArrayLeftByOne should rotate an array of strings to the left by one position`() {
        val arr2 = arrayOf("abc", "bcd", "cde", "def")
        rotateArrayLeftByOne(arr2)
        assertArrayEquals(arrayOf("bcd", "cde", "def", "abc"), arr2)
    }

    @Test
    fun `rotateArrayLeftByOne should handle an empty array`() {
        val arr3 = emptyArray<Int>()
        rotateArrayLeftByOne(arr3)
        assertArrayEquals(emptyArray<Int>(), arr3)
    }

    @Test
    fun `rotateArrayRightByOne should rotate an array of integers to the right by one position`() {
        val arr1 = arrayOf(9, 8, 7, 6, 5)
        rotateArrayRightByOne(arr1)
        assertArrayEquals(arrayOf(5, 9, 8, 7, 6), arr1)
    }

    @Test
    fun `rotateArrayRightByOne should rotate an array of strings to the right by one position`() {
        val arr2 = arrayOf("Zahra", "Reza", "Ali", "Shabnam")
        rotateArrayRightByOne(arr2)
        assertArrayEquals(arrayOf("Shabnam", "Zahra", "Reza", "Ali"), arr2)
    }

    @Test
    fun `rotateArrayRightByOne should handle an empty array`() {
        val arr3 = emptyArray<Int>()
        rotateArrayRightByOne(arr3)
        assertArrayEquals(emptyArray<Int>(), arr3)
    }

}