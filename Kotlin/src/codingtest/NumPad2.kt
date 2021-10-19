package codingtest

data class NumPad(val number: Int, val location: Pair<Int, Int>) {
    operator fun minus(other: NumPad): Int {
        val xRange = (location.first - other.location.first).let {
            if (it < 0) it * -1 else it
        }
        val yRange = (location.second - other.location.second).let {
            if (it < 0) it * -1 else it

        }
        return xRange + yRange
    }
}
val rightArray= intArrayOf(1,)
