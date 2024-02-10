/*
    Compile-time Polymorphism

        - The name functions, that is, the signature remains the same, but parameters or return type is different.
        - At compile time, the compiler then resolves which functions we are trying to call based on the type of parameters and more.
 */

fun doubleOf(num: Int) {
    println(num * 2)
}

fun doubleOf(num: Float) {
    println(num * 2)
}

fun doubleOf(num: Double) {
    println(num * 2)
}

fun main() {
    doubleOf(2)
    doubleOf(2f)
    doubleOf(2.0)
}