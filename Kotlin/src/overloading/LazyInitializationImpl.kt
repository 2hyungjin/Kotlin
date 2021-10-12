package overloading

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange(
                "age", oldValue, value
            ) // 이벤트 보내기
        }
}

class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: PersonRefactored, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: PersonRefactored, prop: KProperty<*>, value: Int) {
        val oldValue = propValue
        propValue = value
        changeSupport.firePropertyChange(prop.name, oldValue, value)
    }
}

class PersonRefactored(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age by ObservableProperty(age, changeSupport)
    var salary by ObservableProperty(salary,changeSupport)
}

fun main(args: Array<String>) {
    
}