package overloading

import Student
import org.omg.CORBA.portable.Delegate
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeSupport
import java.lang.reflect.Type


fun getList(): List<Student> = listOf()

class Teacher {
    //초기화 지연 패턴
//    private var _students: List<Student>? = null
//    val students: List<Student>
//        get() {
//            if (_students == null) _students = getList()
//            return _students!!
//        }


    //by lazy
    val students:List<Student> by lazy { getList() }
    val a=PropertyChangeSupport(this)
}

