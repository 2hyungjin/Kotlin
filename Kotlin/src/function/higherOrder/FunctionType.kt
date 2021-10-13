package function.higherOrder

import Student

val add = { x: Int, y: Int -> x + y }
val sub: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
val div: (Int, Int) -> Int? = { x: Int, y: Int -> (x / y) ?: null }
val mul: ((Int, Int) -> Int)? = { x: Int, y: Int -> x * y }

fun calculateOneAndTwo(operation: (Int, Int) -> Int = { x, y -> x * y }) {
    println(operation(1, 2))
}
fun findZero(numList:List<Int>){
    numList.forEach {
        if(it==0){
            println("find zero")
            return
        }
        println("cannot find zero")
    }
}

fun main() {
    calculateOneAndTwo(add)
    calculateOneAndTwo { x, y -> x * y }
}