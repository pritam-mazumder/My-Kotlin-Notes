/*
    Getters and Setters

        - In Kotlin, getters and setters are optional and are auto-generated by default if you do not create them in your program.
        - However, you can provide custom implementations for them if needed.
        - Here's how you can define custom getters and setters for properties in Kotlin
 */

class Person {
    var name: String? = null
        get() = field        // getter
        set(value) {         // setter
            field = value
        }
}

class Rating {
    var rating: Int = 0
        get() = field
        set(value) {
            field = when {
                value > 10 -> 10
                value < 0 -> 0
                else -> value
            }
        }
}

fun main() {
    val p = Person()
    p.name = "Sova"         // access setter
    println(p.name)         // access getter

    val r = Rating()
    r.rating = 1
    println(r.rating)
}