class Student(val id: Int, val name: String) {
    constructor(id: Int, name: String, age: Int) : this(id, name) {
        println("constructor")
    }
    init {
        println("init")
    }
}


fun main(args: Array<String>) {
    val student = Student(1, "aa",1)
}