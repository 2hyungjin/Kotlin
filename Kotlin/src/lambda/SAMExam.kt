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

    button.setOnClickListener{

    }
}