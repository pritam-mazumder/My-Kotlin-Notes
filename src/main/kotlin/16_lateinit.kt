/*
    Lateinit

        - It stands for “late initialization.”
        - When used with a class property, the lateinit modifier keeps the property from being initialized at the time of its class’ object construction.

        - Memory is not allocated to a lateinit property at the time of declaration.
        - The initialization takes place later when you see fit.

        - A lateinit property is mutable throughout the program.
        - That’s why you should always declare it as a 'var' and not as a 'val' or 'const'.

        - The lateinit properties don’t support the nullable type.


 */

class Agent {
    lateinit var name: String
    fun setup() {
        name = "Sova"
        println(name)
    }
}

fun main() {

    lateinit var myString: String
    // ...middle of the program...
    myString = "Jett"
    println(myString)

    val a = Agent()
    a.setup()
}