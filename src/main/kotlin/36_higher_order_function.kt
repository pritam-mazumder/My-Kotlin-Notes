/*
    In Kotlin functions are “First Class Citizen”
    Means they will be treated like objects.

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun main() {

        // storing functions as variable
        val x = { a: Int, b: Int -> sum(a, b) }
        // or
        val x = ::sum

        println(x(2, 3))
    }




    Higher-Order Function:

        - A function which can accept a function as a parameter or can return a function or can do both is called Higher-Order function.
        - Instead of Integer, String or Array as a parameter to function, we will pass anonymous function or lambdas.

 */


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun pro(a: Int, b: Int): Int {
    return a * b
}

// normal function              // accepting parameters of another function
fun higherOrder(a: Int, b: Int, fn: (Int, Int) -> Int) {
    println(fn(a, b))
}

fun main() {

    higherOrder(2, 4, ::sum)
    higherOrder(2, 4, ::pro)

    // storing function inside a variable
    val x = higherOrder(2, 5, ::pro)
    println(x)
}