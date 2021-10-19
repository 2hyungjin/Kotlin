package codingtest

var answerBuilder = StringBuilder()
val leftArray = intArrayOf(1, 4, 7, 10)
val middleArray = intArrayOf(2, 5, 8, 11)
val rightArray = intArrayOf(3, 6, 9, 12)

enum class Direction {
    RIGHT, LEFT
}

data class Hand(val name: Char, var position: Int = 0, val direction: Direction) {
    fun moveToPosition(position: Int) {
        this.position = position
        answerBuilder.append(this.name)
    }

    fun calculatePosition(target: Int): Int {
        var range: Int
        var targetIndex = middleArray.indexOf(target)
        if (middleArray.contains(position)) {
            range = middleArray.indexOf(position) - targetIndex
            if (range < 0) range *= -1
        } else {
            when (direction) {
                Direction.LEFT -> {
                    range = leftArray.indexOf(position) - targetIndex
                    if (range < 0) range *= -1
                    range++
                }
                Direction.RIGHT -> {
                    range = rightArray.indexOf(position) - targetIndex
                    if (range < 0) range *= -1
                    range++
                }
            }
        }
        return range
    }
}

fun solution(numbers: IntArray, hand: String): String {
    var answer = ""

    var leftHand: Hand = Hand('L', 10, Direction.LEFT)
    var rightHand: Hand = Hand('R', 12, Direction.RIGHT)

    val majorHand = if (hand == "left") leftHand else rightHand

    numbers.map { if (it == 0) 11 else it }.forEach { num ->
        if (leftArray.contains(num)) {
            leftHand.moveToPosition(num)
        }
        if (rightArray.contains(num)) {
            rightHand.moveToPosition(num)
        }
        if (middleArray.contains(num)) {
            val leftRange = leftHand.calculatePosition(num)
            val rightRange = rightHand.calculatePosition(num)
            println("$num : $leftRange $rightRange")
            when (leftRange.compareTo(rightRange)) {
                -1 -> leftHand.moveToPosition(num)
                1 -> rightHand.moveToPosition(num)
                0 -> majorHand.moveToPosition(num)
            }
        }
    }

    return answerBuilder.toString()
}

fun main() {
    println(solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right"))
}