object CreditCard {
    private var balance: Int = 0
    fun pay(price: Int) {
        balance -= price
    }
}

class Employee private constructor(val name: String) {
    companion object {
        fun work() {
            println()
        }
    }
}

fun main() {
    CreditCard.pay(1000)

}