interface Life
class Human() : Life{
    fun think(){}
}
class Animal() : Life{
    fun bark(){}
}
fun doSomething(life:Life){
    (life as Human).think()
    when(life){
        is Human->{
            life.think()
        }
        is Animal->{
            life.bark()
        }
    }
}

fun main(args: Array<String>) {
    val lion = Animal()


}