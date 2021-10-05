package type

val array1= arrayOf(1,2,3)
val arrayOfNulls= arrayOfNulls<Int>(23)
val array = Array<Int>(26) { it * 2 }
fun main() {
    for (i in array){
        println(i)
    }
}