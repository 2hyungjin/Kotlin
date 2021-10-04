package lambda

import javax.swing.text.View

interface OnClickListener {
    abstract fun onClick(view: View)
}

class Button() {
    fun setOnClickListener(onClick: (button: Button) -> Unit) {

    }
}

fun main() {
    val button = Button()

    button.setOnClickListener {

    }
    fun postponeComputation(delay: Int, computation: Runnable) {}

    //lambda
    postponeComputation(1000) { println(42) }

    //anonymous object
    postponeComputation(1000, object : Runnable {
        override fun run() {
            TODO("Not yet implemented")
        }
    })
    fun returnRunnable(): Runnable {
        return Runnable { }
    }


}
