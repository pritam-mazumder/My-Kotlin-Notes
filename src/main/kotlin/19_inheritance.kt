/*
    'open' keyword is used in parent class eligible to make it inhabitable to children class
 */

open class Parent {
    fun a() {
        println("Patent class")
    }
}

class Child : Parent() {
    fun b() {
        println("Child class")
    }
}


open class VAgent(name: String, role: String) {
    init {
        println("$name: $role")
    }
}

class Sova(name: String, role: String) : VAgent(name, role) {
    fun sova() {
        println("Sova is a initiator")
    }
}

class Brim(name: String, role: String) : VAgent(name, role) {
    fun brim() {
        println("Brim is a controller")
    }
}

fun main() {

    val c = Child()
    c.a()
    c.b()

    val s = Sova("SOVA", "initiator")
    s.sova()

    val b = Brim("BRIM", "controller")
    b.brim()
}