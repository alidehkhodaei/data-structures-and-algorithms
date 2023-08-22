package array

/**
 * The function finds the minimum and maximum values in an array of integers and returns them as a pair.
 *
 * @param array An array of integers.
 * @return The function `findMinMaxFromArray` is returning a `Pair<Int, Int>` which contains the minimum and maximum values
 * in the input array.
 */
fun findMinMaxFromArray(array:Array<Int>):Pair<Int,Int> {
    var min = array[0]
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] < min) {
            min = array[i]
        }
        if (array[i] > max) {
            max = array[i]
        }
    }
    return Pair(min,max)
}