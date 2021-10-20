package overloading

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
}

operator fun MutableCollection<Point>.plusAssign(other: Point){
    this.add(other)
}

operator fun Point.not():Point{
    return Point(this.y,this.x)
}

operator fun Point.plus(other: Point): Point = Point(x + other.x, y + other.y)
fun main() {
    val point1 = Point(3, 4)
//    println(point1)
//
//    val pointList = mutableListOf<Point>()
//    pointList += Point(1, 3)
//    println(pointList)

    println(!point1)
}