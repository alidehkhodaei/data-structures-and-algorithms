package array

/**
 * Rotates an array to the right by one position.
 * If the array is empty, the function returns immediately without making any modifications.
 *
 * @param array The array to rotate.
 */
fun <T> rotateArrayRightByOne(array: Array<T>) {
    if (array.isEmpty()) return
    val temp = array[array.size - 1]
    for (i in array.size - 1 downTo 1) {
        array[i] = array[i - 1]
    }
    array[0] = temp
}