package overloading

import java.time.LocalDate

data class Name(var firstName:String, var lastName:String){
    operator fun get(index:Int):String{
        return when(index){
            0-> firstName
            1-> lastName
            else -> throw IndexOutOfBoundsException()
        }
    }
    operator fun set(index: Int,value:String){
        when(index){
            0->firstName=value
            1->lastName=value
            else->throw IndexOutOfBoundsException()
        }
    }
    operator fun contains(c:Char):Boolean{
        return firstName.contains(c)||lastName.contains(c)
    }
}

operator fun ClosedRange<LocalDate>.iterator():Iterator<LocalDate> = object :Iterator<LocalDate>{
    var current=start
    override fun hasNext(): Boolean {
        return current<=endInclusive
    }

    override fun next(): LocalDate =current.apply {
        current=plusDays(1)
    }
}

fun main() {
    val myName=Name("lee","hyungjin")
    val (first,last)=myName
    myName[0]="park"
    println(myName[0])
    println(myName[1])
    println('a' in myName)

    var now=LocalDate.now()

    val thisWeek=now..now.plusWeeks(1)
    for (days in thisWeek){
        println(days)
    }
    println(now.plusDays(1) in thisWeek)
}