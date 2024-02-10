// Addition of two numbers
fun additionOfTwoNums1(num1: Int, num2: Int): Int {
    val sum = num1 + num2
    return sum
}

// One-liner function OR inline function
fun additionOfTwoNums2(num1: Int, num2: Int): Int = num1 + num2
// or
fun additionOfTwoNums3(num1: Int, num2: Int) = num1 + num2

// Odd or even numbers
fun evenOrOdd1(num: Int) {   // return type: void
    val result = if (num % 2 == 0) "Even" else "Odd"
    println(result)
}
// or
fun evenOrOdd2(num: Int) = if (num % 2 == 0) "even" else "odd"

// Print message
fun printMessage1(count: Int) {
    for (i in 0..count)
        println("Count $i")
}

// Print message with default argument (means it'll run at-least specified n number of times)
fun printMessage2(count: Int = 2) {
    for (i in 0..count)
        println("Count $i")
}

fun main() {
    println(additionOfTwoNums1(2, 2))
    println(additionOfTwoNums1(4, 6))

    println(additionOfTwoNums2(6, 8))
    println(additionOfTwoNums3(4, 2))

    println(evenOrOdd1(10))
    println(evenOrOdd2(5))

    println(printMessage1(5))
    println(printMessage2(4))
    println(printMessage2())
}