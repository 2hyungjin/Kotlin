package decorator

class RobotWithWingDecorator(robot: Robot) : RobotDecorator(robot) {
    override fun assemble(): String {
        return super.assemble() + " 날개"
    }
}