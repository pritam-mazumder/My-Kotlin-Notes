/*
    Enum Classes

        - In programming, sometimes there arises a need for a type to have only certain values.
        - To accomplish this, the concept of enumeration was introduced. Enumeration is a named list of constants.

        - The most basic use case for enum classes is the implementation of type-safe enums.
        - Each enum constant is an object. Enum constants are separated by commas.

 */

enum class Days1 {
    // constants   // pre defined values   // names
    SUNDAY,     // ordinal = 0          // name = "SUNDAY"
    MONDAY,     // ordinal = 1          // name = "MONDAY"
    TUESDAY,    // ordinal = 2          // name = "TUESDAY"
    WEDNESDAY,  // ordinal = 3          // name = "WEDNESDAY"
    THURSDAY,   // ordinal = 4          // name = "THURSDAY"
    FRIDAY,     // ordinal = 5          // name = "FRIDAY"
    SATURDAY    // ordinal = 6          // name = "SATURDAY"
}

enum class Days2(var number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}

fun main() {

    // Enum constants are objects of an enum class type
    val value1: Days1 = Days1.SUNDAY

    // each enum object has two properties: ordinal and name
    println(Days1.SUNDAY.ordinal)
    println(Days1.SUNDAY.name + "\n")

    // each enum object has two methods: value() and valueOf()
    val myConstant1: Array<Days1> = Days1.values()
    myConstant1.forEach { println(it) }

    println()

    for (i in Days1.values()) {
        println(i)
    }
}