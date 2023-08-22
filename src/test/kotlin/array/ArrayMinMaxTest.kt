package array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * The ArrayReverseTest class contains test cases for find min and max value in an array.
 */
class ArrayMinMaxTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun `test findMinMaxFromArray function`(array: Array<Int>, expectedMaxMinValue: Pair<Int, Int>) {
        assertEquals(expectedMaxMinValue, findMinMaxFromArray(array))
    }

    companion object {
        @JvmStatic
        private fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(1, 2, 3), Pair(1, 3)),
                Arguments.of(arrayOf(1, 2, 3, 4, 3, 2, 1), Pair(1, 4)),
                Arguments.of(arrayOf(9, 6, 4, 3, 1, 1, 6, 0, 2, 12, 1, 7), Pair(0, 12)),
            )
        }
    }

}