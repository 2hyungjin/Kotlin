package coroutine

import kotlinx.coroutines.*

fun log(msg: String) = println("${java.lang.Thread.currentThread()} : $msg")
fun launchGlobalScope() {
    GlobalScope.launch {
        log("coroutine is started")
    }
}

fun launchRunBlocking() {
    runBlocking {
        launch {
            log("coroutine is started")
        }
    }
}

fun testYield() {
    runBlocking {
        launch {
            log("1")
            yield()
            log("3")
            yield()
            log("5")
        }
        log("after first launch")
        launch {
            log("2")
            delay(1000L)
            log("4")
            delay(1000L)
            log("6")
        }
    }
}

fun testAsync() = runBlocking {
    val def1 = async {
        log("async start")
        3
    }
    val def2 = async {
        log("async2 start")
        1
    }
    println(def1.await() + def2.await())
}


fun main() {
    log("main start")
    testAsync()

}