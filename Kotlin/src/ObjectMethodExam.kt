class Product(val name: String, val price: Int) {
    override fun toString(): String {
        return "Product (name : $name, price : $price)"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Product) return false
        return other.name == name && other.price == price
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 * price
    }
}

fun main() {
    val product = Product("a", 1000)
    val product2 = Product("a", 1000)

    println(product.toString()) //Product (name : a, price : 1000)
    println(product.equals(product2)) //true
    println(product.hashCode()) //3007000
    println(product2.hashCode()) //3007000
}