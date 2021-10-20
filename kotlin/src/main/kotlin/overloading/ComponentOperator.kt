package overloading

class Locate(val x:Int,val y : Int){
    operator fun component1()=x
    operator fun component2()=y
}

fun main() {
    val myLocate=Locate(1,3)
    val (x,y)=myLocate
    println("$x , $y")
}