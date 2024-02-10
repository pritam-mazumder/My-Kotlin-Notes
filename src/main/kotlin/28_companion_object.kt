/*
    Companion objects

        - An object declaration inside a class can be marked with the companion keyword.
        - Members of the companion object can be called simply by using the class name as the qualifier.
        - The name of the companion object can be omitted, in which case the name Companion will be used.
        - Class members can access the private members of the corresponding companion object.

        - 'companion' is similar to 'static' keyword in java.
 */

class Group {
    companion object {
        @JvmStatic  // in case if we want to call this code in fun/method in java code
        fun a() = println("a")
    }
}

class RandomNumber {
    companion object {
        private val a = 0
        private val b = 10

        fun random(): Int {
            return (a..b).random()
        }
    }
}

fun main() {

    Group.a()

    println(RandomNumber.random())
}