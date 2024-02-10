/*
    Lambda Expression:

        - A function without name is called anonymous function.
        - For lambda expression, we can say that it is an anonymous function.
        
    Defining a Lambda:
        - val lambdaName : Type = { argumentList -> codeBody }
        
    Type Declaration:
        - val that : Int -> Int = { three -> three }
        - val more : (String, Int) -> String = { str, int -> str + int }
        - val noReturn : Int -> Unit = { num -> println(num) }

    Lambdas as class extensions:
        - val another : String.(Int) -> String = { this + it }
 */



// example 1:
fun higherOrder2(a: Int, b: Int, fn: (Int, Int) -> Int) {
    println(fn(a, b))
}

// example 4:
class P {
    fun addx(a: Int, b: Int, r: (Int, Int) -> Int) {
        println(r(a, b))
    }
}

fun main() {

    // example 1:
    val x = higherOrder2(2, 4) { a: Int, b: Int -> a + b }
    println(x)

    val y = higherOrder2(2, 5) { a: Int, b: Int -> a * b }
    println(y)


    // example 2:
    val square = { number: Int -> number * number }
    println(square(3))


    // example 3:
    val array = arrayOf(1, 2, 3, 4, 5, 6)

    array.forEach { item -> println(item * 4) }
    println()
    array.forEach { println(it * 4) }


    // example 4:
    val p = P()
    val res = { x: Int, y: Int -> x + y }
    p.addx(1, 3, res)
}