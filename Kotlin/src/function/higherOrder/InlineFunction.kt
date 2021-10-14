package function.higherOrder

inline fun someMethod(noinline f:()->Unit){
    someMethod2(f)
}
fun someMethod2(f:()->Unit){
}