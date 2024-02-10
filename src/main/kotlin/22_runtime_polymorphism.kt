/*
    Runtime Polymorphism

        - Parent can hold a reference to its child
        - Parents can call methods of its child classes (which are common).
        - The compiler resolves a call to overridden/overloaded methods at runtime.
        - We can achieve run-time polymorphism using method overriding.
        - Helps to write maintainable and extensible code.
        - Helps in interacting with objects via common interface.
 */

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun calculateArea(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}

fun main() {
//    val circle: Shape = Circle(10.0)
//    val square: Shape = Square(10.0)
//    val triangle: Shape = Triangle(10.0, 20.0)

//    println(circle.area())
//    println(square.area())
//    println(triangle.area())

    val shapes = arrayOf(Circle(10.0), Square(10.0), Triangle(10.0, 20.0))
    calculateArea(shapes)
}