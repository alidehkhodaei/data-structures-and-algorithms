package array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 *  The ArrayRotateTest class contains test cases for the rotateArrayLeftByOne functions,
 *  which rotate the elements of an array to the left by one position, respectively.
 */
class ArrayLeftRotateTest {

    @ParameterizedTest
    @MethodSource("rotateLeftProvider")
    fun <T> testRotateArrayLeftByOne(input: Array<T>, expected: Array<T>) {
        rotateArrayLeftByOne(input)
        assertArrayEquals(expected, input)
    }

    companion object {

        @JvmStatic
        private fun rotateLeftProvider(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(1, 2, 3, 4, 5), arrayOf(2, 3, 4, 5, 1)),
                Arguments.of(arrayOf("abc", "bcd", "cde", "def"), arrayOf("bcd", "cde", "def", "abc")),
                Arguments.of(arrayOf(0), arrayOf(0))
            )
        }

    }

}