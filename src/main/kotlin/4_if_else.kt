fun main() {

//    example 1:
    val isRaining = true

    if (isRaining) {
        println("Take umbrella")
    } else {
        println("No rain")
    }


//    example 2:
    val a = 2
    val b = 4

    if (a > b) {
        println("a > b")
    } else if (a < 2) {
        println("a < b")
    } else {
        println("a == b")
    }


//    example 3:
    val n = 21
    val result = if (n % 2 == 0) "Evan" else "False"
    // in kotlin we can also store the conditional statement in variables

    println(result)

    // kotlin don't have ternary operators
}