package lambda

import Student

fun main() {
    studentList.map(Student::id).filter { it > 2 }
    studentList.asSequence()
        .map { it.id }
        .filter { it > 2 }
        .toList()

    val naturalNumber = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumber.takeWhile { it <= 100 }
    val sumOfEven = numbersTo100
        .filter {
            it % 2 == 0
        }
        .sum()
    println(sumOfEven)

}