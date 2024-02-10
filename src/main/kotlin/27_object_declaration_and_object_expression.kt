/*
    Object Declaration:

        - Class and its Single is created at once.
        - Constructors are allowed (init block is allowed)
        - Singleton Patterns.
        - Inheritance of classes / interfaces is allowed.

        'object' is similar to 'static' in java


    Object Expressions:

        - The object keyword can also be used to create objects of an anonymous class known as anonymous objects.
        - They are used if you need to create an object of a slight modification of some class or interface without declaring a subclass for it.
 */

// Object Declaration
object Agent2 {
    val name = "Sova"
    fun ult() {
        println("Hunter's Fury")
    }
}

// Object Expressions
open class Mobile {
    fun call() = println("Call")
    fun message() = println("Message")
    open fun camera() = println("Camera")
}

fun main() {
    println(Agent2.name)
    println(Agent2.ult())

    val phone = object : Mobile() {
        override fun camera() {
            println("No camera")
        }
    }

    phone.call()
    phone.message()
    phone.camera()
}