class Person(private val age: Int) {
    val availabilityOfDriving: Boolean
        get() = age > 19
}

fun main() {
    val p1=Person(19)
    val p2=Person(20)
    println(p1.availabilityOfDriving)
    println(p2.availabilityOfDriving)
}