import kotlin.reflect.typeOf

interface ClickEventListener{
    fun click()
}
fun main(args: Array<String>) {
    view.addOnclickListner(object : ClickEventListener{
        override fun click() {
            TODO("Not yet implemented")
        }
    })
}