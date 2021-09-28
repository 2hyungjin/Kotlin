fun main() {
    infix fun Int.add(other: Int) = this + other
    println(3 add 4)
}