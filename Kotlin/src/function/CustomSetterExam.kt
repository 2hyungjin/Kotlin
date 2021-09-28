package function

class CustomSetterExam {
    var name: String = "unknown"
        set(value) {
            println("name is changed $field -> $value")
            field = value
        }
    var id: Int = 0
        private set
}

fun main() {
    val c = CustomSetterExam();
    c.name = "2hyungjin"

}