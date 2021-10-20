package generic


interface ListSample<T> {
    operator fun get(index: Int): T
}

class ArrayList<T> : ListSample<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

fun <T : Any> someMethod(value: T) {
    println(value.toString())
}


fun <T : Number> someMethod(num: T) {

}

class StringList<String> : ListSample<String> {
    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }
}
fun <T> checkIsList(value: T) {
    println {

    }
}

fun main() {

}