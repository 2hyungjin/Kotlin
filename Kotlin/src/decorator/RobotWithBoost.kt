package decorator

class RobotWithBoost(val robot: Robot) :Robot by robot{
    override fun assemble(): String {
        return robot.assemble()
    }
}