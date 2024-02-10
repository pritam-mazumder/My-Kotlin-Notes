abstract class Shape2 {
    init {
        println("The area is:")
    }

    abstract fun area(): Double     // By default, abstract is 'open'
    open fun justFunction() {
        println("just a non abstract function in abstract class. call it if you want to")
    }
}

class Square2(var side: Double) : Shape2() {
    override fun area() = side * side
}

fun main() {
    val s = Square2(2.0)
    println(s.area())
}