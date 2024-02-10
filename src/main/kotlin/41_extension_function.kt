/*
    Extension Function

        - The ability to add more functionality to the existing classes, without inheriting them.
        - This is achieved through a feature known as extensions.
        - When a function is added to an existing class it is known as Extension Function.
        - To add an extension function to a class, define a new function appended to the classname.
 */



// example 1
class Square3(val s: Int) {
    fun area() = println(s * s)
}

// extension function
fun Square3.perimeter() = println(4 * s)


// example 2
class VA {
    var name: String = ""
    fun agent(): String {
        return name
    }
}

fun VA.adds(i: VA): String {
    val x = VA()
    x.name = this.name + " " + i.name
    return x.name
}

fun main() {

    // example 1
    val i = Square3(2)
    i.area()
    i.perimeter()


    // example 2
    val a = VA()
    a.name = "sova"
    println(a.agent())

    val b = VA()
    b.name = "sage"
    println(b.agent())

    val c = VA()
    c.name = a.adds(b)
    println(c.agent())
}