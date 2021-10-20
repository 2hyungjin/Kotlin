package decorator

open class RobotDecorator(val robot: Robot) : Robot {
    override fun assemble(): String {
        return robot.assemble()
    }
}