package array

/**
 * Rotates an array to the left by one position.
 * If the array is empty, the function returns immediately without making any modifications.
 *
 * @param arr The array to rotate.
 */
fun <T> rotateArrayLeftByOne(arr: Array<T>) {
    if (arr.isEmpty()) return
    val temp = arr[0]
    for (i in 0 until arr.size - 1) {
        arr[i] = arr[i + 1]
    }
    arr[arr.size - 1] = temp
}

/**
 * Rotates an array to the right by one position.
 * If the array is empty, the function returns immediately without making any modifications.
 *
 * @param arr The array to rotate.
 */
fun <T> rotateArrayRightByOne(arr: Array<T>) {
    if (arr.isEmpty()) return
    val temp = arr[arr.size - 1]
    for (i in arr.size - 1 downTo 1) {
        arr[i] = arr[i - 1]
    }
    arr[0] = temp
}