import kotlin.math.pow

// function overloading
fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addition(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun addition2(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun power(num1: Double, num2: Double): Double {
    return num1.pow(num2)
}

fun main() {
    println(addition(2, 4))
    println(addition(2.0, 4.0))

    // named arguments (passing arguments with specified names)
    println(addition(num2 = 2, num1 = 8))

    // storing functions in variables
    val fn = ::addition2
    // val fn: (num1: Int, num2: Int) -> Int = ::addition2
    println(fn(2, 3))

    val p = ::power
    println(p(2.0, 3.0))
}