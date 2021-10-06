package overloading

class Board(val id: Long, val title: String, val contents: String) : Comparable<Board> {
    override fun compareTo(other: Board): Int {
        return compareValuesBy(this, other,Board::id)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Board) return false
        return other.id == this.id && other.contents == this.contents && other.title == this.title
    }
}

fun main() {
    val board = Board(1, "a", "aa")
    val board2 = Board(1, "a", "aa")
    val board3 = Board(2, "ab", "aa")
    println(board == board2) //true
    println(board == null) //false
    println(board == board3) //false
}