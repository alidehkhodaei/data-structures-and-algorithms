package array

/**
 * The function then reverses the elements of the array between the starting and ending indices using a while loop
 * and a temporary variable `temp`. Finally, the function returns the reversed array.
 * @param array: A array
 * @param start: start index array
 * @param end: end index array
 * @return Reverses elements in the array.
 */
fun <T> reverseArray(array: Array<T>, start: Int, end: Int): Array<T> {
    var index = start
    var lastIndex = end
    while (index < lastIndex) {
        val temp = array[index]
        array[index] = array[lastIndex]
        array[lastIndex] = temp
        index++
        lastIndex--
    }
    return array
}
