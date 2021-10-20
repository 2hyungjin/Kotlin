package generic

open class Animal {}
open class Bird : Animal() {}
class Penguin : Bird() {}
class Zoo<out T:Animal>(){
    val animals= listOf<T>()

    fun getAnimal():T{
        return animals[0]
    }

}
class Zoo2<in T:Bird>(){
    private val animals= arrayListOf<T>()

    fun setAnimal(animal: T){}
}
fun feed(zoo: Zoo<Animal>){

}
fun main() {
    val zoo=Zoo<Bird>()
    feed(zoo)

}
