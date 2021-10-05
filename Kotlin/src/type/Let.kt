package type

fun main() {
    val num: Int? = null
    num?.let {
        someMethod(it)
        someMethod2(it)
    }

}

fun someMethod(it: Int) {
    TODO("Not yet implemented")
}

fun someMethod2(it: Int) {
    TODO("Not yet implemented")
}
