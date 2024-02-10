/*
    Varargs:

        - Sometimes we need a function where we can pass n number of parameters, and the value of n can be decided at runtime.
        - Kotlin provides us to achieve the same by defining a parameter of a function as vararg.
        - We can pass n number of parameters to a vararg variable of the defined datatype or even of a generic type.
 */

fun addAllNums(vararg nums: Int): Int {
    var sum = 0
    for (n in nums) {
        sum = sum + n
    }
    return sum
}

fun main() {
    println(addAllNums(1, 2))
    println(addAllNums(1, 2, 3, 4, 5))

}