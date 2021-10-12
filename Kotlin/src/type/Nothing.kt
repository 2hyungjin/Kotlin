package type

import java.lang.Exception

fun fail(msg: String): Nothing {
    throw Exception(msg)
}

fun main() {
    val result: String? = null
    println(result ?: fail("fail"))
    println("result is arrived")
}

