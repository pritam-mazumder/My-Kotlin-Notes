/*
    Access / Visibility Modifiers:

        Visibility modifiers in Kotlin:
            - private
            - protected
            - internal
            - public
        The default visibility is public.

        - If you don't use a visibility modifier, 'public' is used by default, which means that your declarations will be visible everywhere.
        - If you mark it as 'internal', it will be visible everywhere in the same module.
        - If you mark a declaration as 'private', it will only be visible inside the file that contains the declaration.
        - The 'protected' modifier is not available for top-level declarations.

        +-----------+-----------------------+-----------------------+
        | MODIFIERS | CLASS MEMBER          | TOP-LEVEL DECLARATION |
        +-----------+-----------------------+-----------------------+
        | public    | visible everywhere    | visible everywhere    |
        | internal  | visible in a module   | visible in a module   |
        | private   | visible in a class    | visible in a file     |
        | protected | visible in subclasses | N/A                   |
        +-----------+-----------------------+-----------------------+
 */





// Public Modifier

/*
// public class
class MyClass {
    // public function
    fun sayHello() {
        println("Hello from MyClass")
    }
}

// public function
fun main() {
    val obj = MyClass()
    obj.sayHello()
}
 */





// Internal Modifier

/*
// Module 1
internal class InternalClassA {
    internal val message = "This is from InternalClassA"
}

internal fun internalFunctionA() {
    println("This is an internal function from ModuleA")
}

// Module 2
fun main() {
    val obj = InternalClassA()
    println(obj.message) // Accessing an internal property
    internalFunctionA()   // Calling an internal function
}
 */





// Private Modifier

/*
class MyClass {
    private val privateProperty = "This is a private property"
    private fun privateFunction() {
        println("This is a private function")
    }

    fun publicFunction() {
        // Accessing the private property and function from within the class
        println(privateProperty)
        privateFunction()
    }
}

fun main() {
    val obj = MyClass()
    // Accessing the public function from outside the class (allowed)
    obj.publicFunction()
    // Attempting to access the private property and function from outside the class (not allowed)
    // println(myObject.privateProperty) // Error: Cannot access 'privateProperty'
    // myObject.privateFunction()        // Error: Cannot access 'privateFunction'
}
 */





// Protected Modifier

/*
open class MyBaseClass {
    // protected property and can be accessed by subclasses
    protected val protectedProperty = "This is a protected property"

    // protected function and can be accessed by subclasses
    protected fun protectedFunction() {
        println("This is a protected function")
    }

    // function and can be accessed from anywhere
    fun publicFunction() {
        println("This is a public function")
    }
}

class MySubclass : MyBaseClass() {
    fun accessProtected() {
        // Accessing the protected property and function from the subclass
        println(protectedProperty)
        protectedFunction()
        // Accessing the public function from the base class
        publicFunction()
    }
}

fun main() {
    val mySubclass = MySubclass()
    // Accessing the protected and public functions from the subclass
    mySubclass.accessProtected()
    // Attempting to access the protected members directly from the main function (not allowed)
    // println(mySubclass.protectedProperty) // Error: Cannot access 'protectedProperty'
    // mySubclass.protectedFunction()        // Error: Cannot access 'protectedFunction'
    // Accessing the public function from the main function (allowed)
    mySubclass.publicFunction()
}
 */