/*
    Generics:

        - Classes in Kotlin can have type parameters, just like in Java
        - Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while keeping a check on the compile-time type safety.
        - Angle brackets <> are used to specify the type parameter in the program.

    Advantages of generic:

        - Type casting is evitable: No need to typecast the object.
        - Type safety: Generic allows only a single type of object at a time.
        - Compile time safety: Generics code is checked at compile time for the parameterized type so that it avoids run-time error.
 */

class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    init {
        println(data)
    }
}

fun main() {
    val iObj = Container<Int>(2)
    val sObj = Container<String>("2")
}