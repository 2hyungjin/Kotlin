package lambda

fun getPrimeList(limit: Int): MutableList<Int> {
    val primeList = arrayListOf<Int>().apply {
        add(2)
    }

    for (num in 3..limit + 1) {
        for (i in primeList) {
            if (num % i == 0) {
                break
            }
            if (i == primeList.last()) {
                primeList.add(num)
                break
            }
        }
    }
    return primeList
}

fun main() {
    println(getPrimeList(100))
}