/*
    Ranges
        - range is defined by its two endpoint values, which are both included in the range.
        - they are created with
            1.rangeTo(4)
            1 downTo 4
            (1..4) operators which are complemented by in and !in.
        - The main operation on ranges is contained, which is usually used in the form of in and !in operators.

        e.g.,
            1..10  // Range of integers starting from 1 to 10
            a..z   // Range of characters starting from a to z
            A..Z   // Range of capital characters starting from A to Z


    In "Range" the upper bound is included
    In "until" the upper bound is not included

    1..10           1 to 10
    1.rangeTo(10)   1 to 10
    1 until 10      1 to 9
 */

fun main() {
    val num1 = 10
    val result1 = num1 in 1..10
    val result2 = num1 in 1.rangeTo(10)
    val result3 = num1 !in 1..10

    println(result1)
    println(result2)
    println(result3)


    val num2 = 10
    val result4 = num2 in 1 until 10
    val result5 = num2 in 1 until 11
    println(result4)
    println(result5)
}