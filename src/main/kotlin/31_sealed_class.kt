/*
    Sealed Class
    (restrictions)

    class > sealed class > enum class

        - In layman terms, as the name suggests, sealed classes are sealed or closed, hence making them restricted.
        - Sealed classes are used for representing the restricted class hierarchies wherein the object or the value can have value only among one of the types, thus fixing your type hierarchies.
        - Sealed classes are commonly used in cases where you know what a given value to be only among a given set of options.
        - Sealed classes are important in ensuring type safety by restricting the set of types at compile-time only.

    Sealed class rules
        - Sealed classes are abstract and can have abstract members.
        - Sealed classes cannot be instantiated directly.
        - Sealed classes cannot have public constructors (The constructors are private by default).
        - Sealed classes can have subclasses, but they must either be in the same file or nested inside the sealed class declaration.

        - The subclass of sealed classes must be declared in the same file in which sealed class itself is declared.
        - The subclass can be a data class, regular class, object class or even another sealed class or even sealed interface.
        - By default, the constructor of a sealed class is private, and we cannot make it as non-private.

 */

sealed class Shape3 {
    // data class
    data class Circle(var radius: Float) : Shape3()

    class Square(var side: Int) : Shape3()
    class Rectangle(var length: Int, var breadth: Int) : Shape3()

    // object declaration
    object NotAShape : Shape3()

    // another sealed class
    // sealed class Line : Shape3()

    // sealed interface
    // sealed interface Draw

    // these subclasses can be put outside the sealed class as well but cannot be put them outside the file or in any other packages
}

class Triangle3(var length: Int, var breadth: Int) : Shape3()

fun checkShape(s3: Shape3) {
    when (s3) {
        is Shape3.Circle -> println("Circle = ${Math.PI * s3.radius * s3.radius}")
        is Shape3.Square -> println("Square = ${s3.side * s3.side}")
        is Shape3.Rectangle -> println("Rectangle = ${s3.length * s3.breadth}")
        is Triangle3 -> println("Triangle = ${(s3.length * s3.breadth) / 2}")
        Shape3.NotAShape -> println("No shape found")
        // for singleton object within the 'when' statement we do not use 'is' keyword
    }
}

fun main() {
    var circle5 = Shape3.Circle(10.0f)
    var square5 = Shape3.Square(10)
    var rectangle5 = Shape3.Rectangle(20, 10)
    var triangle5 = Triangle3(20, 10)

    var noShape5 = Shape3.NotAShape

    checkShape(circle5)
    checkShape(square5)
    checkShape(rectangle5)
    checkShape(triangle5)
    checkShape(noShape5)
}