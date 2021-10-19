package annotation
@Deprecated("remove(index) is deprecated use removeAt(index) instead",replaceWith = ReplaceWith("removeAt(index)"))
fun remove(index:Int){}

class Sample{

}
fun main() {
    remove(1)
}