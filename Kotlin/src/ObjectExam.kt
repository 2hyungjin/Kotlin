object CreditCard {
    private var balance: Int = 0
    fun pay(price: Int) {
        balance -= price
    }
}

fun main() {
    CreditCard.pay(1000)
}