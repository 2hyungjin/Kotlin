package type

import Student

class LateInitSample() {
    lateinit var student: Student
    fun initProperty(student: Student) {
        this.student = student
    }

}
