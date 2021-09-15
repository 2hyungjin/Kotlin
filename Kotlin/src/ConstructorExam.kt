open class Student constructor(val id: Int, val name: String)
class SecondGradeStudent(id: Int, name: String, major: String) : Student(id, name)

open class A{

}

fun main(args: Array<String>) {
    val student = Student(1, "aa")
}