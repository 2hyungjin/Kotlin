package type

fun strLen(string: String): Int = string.length

//fun nullableStrLen(string: String?): Int = if (string != null) string.length else 0
//fun nullableStrLen(string: String?): Int? = string?.length
//fun nullableStrLen(string: String?): Int = if (string != null) string.length else 0

//fun nullableStrLen(string: String?): Int = string?.length ?: 0

fun main() {
    val string1 = "1"
    println(string1 as Int)
}