package basic

class Constructor{
    constructor(num1: Int, num2:Int){
        println("constructor")
    }
    init {
        println("initialize")
    }

}

fun main() {
    val constructor=Constructor(1,2)
    //initialize
    //constructor
}