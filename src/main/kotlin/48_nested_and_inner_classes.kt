/*
    Nested class

        - Nested class is such class which is created inside another class.
        - In Kotlin, nested class is by default static, so its data member and member function can be accessed without creating an object of class.
        - Nested class cannot be able to access the data member of outer class.

    Inner class

        - Inner class is a class which is created inside another class with keyword inner.
        - In other words, we can say that a nested class which is marked as "inner" is called inner class.
        - Inner class cannot be declared inside interfaces or non-inner nested classes.
        - The advantage of inner class over nested class is that, it is able to access members of outer class even it is private.
        - Inner class keeps a reference to an object of outer class.
 */

// outer class
class Outer {
    val i = "Inside outer class"

    // nested class
    class Nested {
        val j = "Inside nested class"
        fun nTest() {
            // nested class cannot access the variables/properties of outer class
        }
    }

    inner class Inner {
        val k = "Inside inner class"
        fun iTest() {
            // inner class can access the variables/properties of outer class
            println(i + "\n")
            println(k)
        }
    }
}

fun main() {

    // creating the object of outer class
    val outerObj = Outer()
    println(outerObj.i + "\n")

    // creating the object of inner class
    val nestedObj = Outer.Nested()
    println(nestedObj.j + "\n")

    // creating the object of inner class
    // method 1
    val outerObj2 = Outer()
    val innerObj = outerObj2.Inner()
    innerObj.iTest()
    
    // method 2
    val innerObj2 = Outer().Inner()
    innerObj2.iTest()

}