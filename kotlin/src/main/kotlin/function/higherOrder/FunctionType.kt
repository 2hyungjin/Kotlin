package function.higherOrder

import Student

val add = { x: Int, y: Int -> x + y }
val sub: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
val div: (Int, Int) -> Int? = { x: Int, y: Int -> (x / y) ?: null }
val mul: ((Int, Int) -> Int)? = { x: Int, y: Int -> x * y }

fun calculateOneAndTwo(operation: (Int, Int) -> Int = { x, y -> x * y }) {
    println(operation(1, 2))
}

fun findZero(numList: List<Int>) {
    numList.forEach {
        if (it == 0) {
            println("find zero")
            return
        }
        println("cannot find zero")
    }
}

fun findOne(numList: List<Int>) {
    numList.forEach lable@{
        if (it == 1) {
            println("find one")
            return@lable
        }
        println("cannot find one")
    }
}


fun findTwo(numList: List<Int>) {
    numList.forEach(fun(num) {
        if (num == 2) {
            println("find two")
            return
        }
        println("cannot find two")
    })
}

fun checkIsList(value:Any){
    println(value is List<*>)
}

inline fun <reified T> someMethod(value: Any){
    if (value is T){}
}
fun main() {
//    calculateOneAndTwo(add)
//    calculateOneAndTwo { x, y -> x * y }
    findOne(listOf(1, 2, 1, 2, 4))
}