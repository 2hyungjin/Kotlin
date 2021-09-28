package lambda

fun main() {
    val sum = { x: Int, y: Int -> x + y } //람다 선언
    run { println("hello lambda") } //run 함수

    data class Student(val name: String, val age: Int)

    val list = listOf<Student>(Student("lee", 13), Student("kim", 8), Student("park", 17))
    list.maxByOrNull { it.age }
    list.maxByOrNull({ it: Student -> it.age }) // 풀어서 쓴다면 이것과 같다.
    list.maxByOrNull() { it: Student -> it.age } // 함수 호출 시 맨 뒤에 있는 인자가 람다 식이라면 그 람다를 괄호 밖을 빼낼 수 있다.
    list.maxByOrNull { it: Student -> it.age } // 람다가 어떤 함수의 유일한 인자이고 괄호 뒤에 람다를 썼다면 빈 괄호를 없앨 수 있다.
    list.maxByOrNull { it -> it.age } // 파라미터 타입을 생략할 수도 있다.
    list.maxByOrNull { it.age }
    val sub = { a: Int, b: Int ->
        println("subtract")
        println("$a - $b ")

        a - b // 결과 값
    }
    println(sub(1, 2))

    fun countElements(set: Collection<Any>) {
        var counter = 0
        set.forEach {
            counter++
        }
    }

    val func1 = Student::age
    val func2 = { student: Student -> student.age }
    list.maxByOrNull(Student::age)
    list.maxByOrNull { it.age }

    val createNewStudent = ::Student
}
