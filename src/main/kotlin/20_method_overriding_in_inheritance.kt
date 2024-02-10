// Example 1
open class Base {
    open fun display() {
        println("Base class function")
    }
}

class Derived : Base() {
    override fun display() {
        println("Derived class function")
    }
}

// Example 2
open class Google {
    open fun os() = println("Android")  // single line function
}

class Samsung : Google() {
    override fun os() = println("One UI")
}

class Xiaomi : Google() {
    override fun os() = println("MIUI")
}

// Example 3
open class S22Ultra(ram: Int, rom: Int) {
    val ram: Int = ram
    val rom: Int = rom
    open fun specs() {
        println("Ram: $ram \nRom: $rom")
    }
}

class S23Ultra(ram: Int, rom: Int) : S22Ultra(ram, rom) {
    override fun specs() {
        super.specs()   // calling parent class first
        println("Ram: $ram \nRom: $rom asdf")
    }
}

fun main() {
    val d = Derived()
    d.display()

    val g = Google()
    g.os()
    val s = Samsung()
    s.os()
    val x = Xiaomi()
    x.os()

    val s22 = S22Ultra(8, 128)
    s22.specs()
    val s23 = S23Ultra(12, 256)
    s23.specs()
}