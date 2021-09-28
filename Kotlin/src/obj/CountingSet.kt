package obj

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
    var counter: Int = 0
    override fun add(element: T): Boolean {
        counter++
        return innerSet.add(element)
    }

}

fun main() {
    val set = CountingSet<Int>(arrayListOf())
    set.add(1)
    set.add(2)
    println(set.counter)
}