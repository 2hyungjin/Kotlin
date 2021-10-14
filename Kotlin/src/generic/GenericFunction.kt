package generic

fun <T> List<T>.printAll() {
    this.forEach { println(it) }
}

val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    listOf<String>("aa", "bb", "cc").printAll()
    println(listOf<String>("aa", "bb", "cc").lastIndex)
}