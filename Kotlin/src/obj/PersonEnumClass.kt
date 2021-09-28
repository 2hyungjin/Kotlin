package obj

enum class PersonEnumClass(val nickName: String, val age: Int) {
    JANE("jane", 15), POUL("pol", 13), JIMMY("jim", 23);

    fun introduce() = "$name($age)"
    fun getName(person: PersonEnumClass) = when (person) {
        PersonEnumClass.JANE, POUL, JIMMY -> {
        }
    }
    
}

fun main(args: Array<String>) {
    val jane = PersonEnumClass.JANE

}