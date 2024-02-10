// Example 1
interface Vehicle {
    fun start()     // by default, normal functions are always 'public' & 'open'
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stoped")
    }
}

// Example 2
interface A {
    fun ult() = println("From interface A")
}

interface B {
    fun ult() = println("From interface B")
}

class Controller : A, B {
    override fun ult() {
        super<A>.ult()
        super<B>.ult()
    }
}

fun main() {
    var obj = Car()
    obj.start()
    obj.stop()

    var c = Controller()
    c.ult()
}
