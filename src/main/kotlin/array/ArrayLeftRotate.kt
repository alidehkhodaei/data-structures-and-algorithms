package array

/**
 * Rotates an array to the left by one position.
 * If the array is empty, the function returns immediately without making any modifications.
 *
 * @param array The array to rotate.
 */
fun <T> rotateArrayLeftByOne(array: Array<T>) {
    if (array.isEmpty()) return
    val temp = array[0]
    for (i in 0 until array.size - 1) {
        array[i] = array[i + 1]
    }
    array[array.size - 1] = temp
}