package string

/**
 * The function takes a string as input and returns the reversed version of the string.
 * @param str The input string that needs to be reversed.
 * @return The function `reverseString` returns a reversed version of the input string `str`.
 */
fun reverseString(str: String): String {
    val stringBuilder = StringBuilder()
    for (i in str.length - 1 downTo 0) {
        stringBuilder.append(str[i])
    }
    return stringBuilder.toString()
}

