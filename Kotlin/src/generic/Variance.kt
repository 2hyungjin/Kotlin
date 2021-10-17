package generic

open class Animal {}
open class Bird : Animal() {}
class Penguin : Bird() {}
//class Zoo<out T:Animal>(){
//    val animals= listOf<T>()
//
//    fun getAnimal():T{
//        return animals[0]
//    }
//    fun setAnimal(animal: T){
//
//    }
//}
//class Zoo<in T:Bird>(){
//    private val animals= arrayListOf<T>()
//
//    fun getAnimal():T{
//        return animals[0]
//    }
//    fun setAnimal(animal: T){
//        animals.add(animal)
//    }
//}
//fun feed(zoo: Zoo<Penguin>){
//
//}
//fun main() {
//    val zoo=Zoo<Bird>()
//    feed(zoo)
//    zoo.setAnimal(Animal())
//
//}

fun main() {
    val a = intArrayOf().apply {  }
}