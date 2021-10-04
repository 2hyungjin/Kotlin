package lambda

//fun even(limit: Int): List<Int> {
//    val evenList = mutableListOf<Int>()
//    for (i in 1..limit){
//        if(i%2==0){
//            evenList.add(i)
//        }
//    }
//    return evenList
//}

//fun even(limit: Int): List<Int> {
//    return with(mutableListOf<Int>()) {
//        for (i in 1..limit) {
//            if (i % 2 == 0) {
//                add(i)
//            }
//        }
//        this
//    }
//}

fun even(limit: Int): List<Int> = mutableListOf<Int>().apply {
    for (i in 1..limit){
        if(i%2==0){
            add(i)
        }
    }
}

fun main() {
    println(even(10))
}