package decorator

class RobotWithFistDecorator(robot: Robot) : RobotDecorator(robot) {
    override fun assemble(): String {
        return super.assemble() + " 로봇주먹"
    }
}