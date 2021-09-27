package decorator

fun main() {
    val robotA = RobotWithFistDecorator(BasicRobot())
    val robotB = RobotWithWingDecorator(RobotWithFistDecorator(BasicRobot()))

    println(robotA.assemble())
    println(robotB.assemble())
}