sealed class Creature {
    class Animal(): Creature()
    class Plant(): Creature()
}

fun doSomething(creature: Creature) {
    when (creature) {
        is Creature.Animal -> {

        }
        is Creature.Plant -> {

        }
    }
}

fun main(args: Array<String>) {

}