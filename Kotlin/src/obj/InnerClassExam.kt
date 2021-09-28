class OuterClass() {
    class InnerClass1() {
        // 외부 클래스를 참조하지 않는다.
    }

    inner class InnerClass2 {
        // 외부 클래스를 참조한다.
        fun getOuterReference() = this@OuterClass
    }
}