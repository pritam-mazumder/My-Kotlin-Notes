fun tc1(a: Int, b: Int) {
    try {
        var int = a / b
        println(int)
    } catch (e: Exception) {
        println(e.printStackTrace())
    } finally {
        println("End")
    }
}

fun tc2(a: Array<Int>) {
    try {
        println(a[5])
    } catch (e: Exception) {
        println(e.printStackTrace())
    } finally {
        println("end")
    }
}

fun main() {
//    tc1(1, 2)

    val a = arrayOf(0, 1, 2, 3, 4)
//    tc2(a)
}