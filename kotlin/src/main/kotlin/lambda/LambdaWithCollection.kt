package lambda
import Student

val studentList = listOf<Student>(Student(1, "lee"), Student(2, "park"), Student(3, "kim"), Student(1, "choi"))

fun main(args: Array<String>) {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6)
    //filter
    println(list.filter { it > 3 })

    //map
    println(list.map { it * 2 })

    //filter & map
    val maxId = studentList.maxByOrNull(Student::id)?.id
    println(studentList.filter { it.id == maxId })

    //all & any
    val isBiggerthan10 = { num: Int -> num > 10 } //10보다 큰 수인지 반환하는 술어 함수
    val numList = listOf<Int>(1, 3, 7, 10, 24)
    println(numList.all(isBiggerthan10))
    println(numList.any(isBiggerthan10))
    println(numList.count(isBiggerthan10))
    println(numList.find(isBiggerthan10))

    //groupBY
    println(studentList.groupBy { it.id })

    //flatMap & flatten
    data class ClassRoom(val number: Int, val students: List<Student>)

    val classRoomList = listOf<ClassRoom>(
        ClassRoom(1, studentList),
        ClassRoom(2, studentList.map { Student(it.id, it.name.reversed()) }),
        ClassRoom(3, studentList.filter { it.id == 3 })
    )
    println(classRoomList.flatMap { it.students })


}