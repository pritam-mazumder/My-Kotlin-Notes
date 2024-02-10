/*
    when()
        - Kotlin does not provide an option to write a switch-case statement
        - However, we can implement the switch-case functionality in Kotlin using when() function.
        - It works exactly the same way switch works in other programming languages.
 */

fun main() {

    println("Enter the number")
    val day = Integer.parseInt(readLine())

    // storing when() function in a variable
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)
}