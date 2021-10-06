interface PropertyExam {
    val id: Int
}

class Class1(override val id: Int) : PropertyExam {}
class Class2() : PropertyExam {
    override val id: Int
        get() = TODO("Not yet implemented")
}

class Class3(_id: Int) : PropertyExam {
    override val id: Int = _id
}