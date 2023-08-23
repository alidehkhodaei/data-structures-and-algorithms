package array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 *  The ArrayRotateTest class contains test cases for the rotateArrayRightByOne functions,
 *  which rotate the elements of an array to the right by one position, respectively.
 */
class ArrayRightRotateTest {

    @ParameterizedTest
    @MethodSource("rotateRightProvider")
    fun <T> testRotateArrayRightByOne(input: Array<T>, expected: Array<T>) {
        rotateArrayRightByOne(input)
        assertArrayEquals(expected, input)
    }

    companion object {

        @JvmStatic
        private fun rotateRightProvider(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(1, 2, 3, 4, 5), arrayOf(5, 1, 2, 3, 4)),
                Arguments.of(arrayOf("abc", "bcd", "cde", "def"), arrayOf("def", "abc", "bcd", "cde")),
                Arguments.of(arrayOf(0), arrayOf(0))
            )
        }

    }

}