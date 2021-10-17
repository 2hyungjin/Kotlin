package basic

interface Sample {
    fun sample()
}
class SampleImpl : Sample{
    override fun sample() {
        println("sample")
    }
    fun sampleMethod(){

    }

}

fun main() {
    val list= listOf<Int>(1,5,6,7,2,3)
    println(list.sorted())
    println(list.sortedDescending())
}