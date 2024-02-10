// Primary constructor = Default constructor
// Secondary constructor = Parameterized constructor

/*
    Secondary Constructor

    Kotlin may have one or more secondary constructors.
    They are created using 'constructor' keyword.
    Secondary constructors are not that common in Kotlin.
 */

// class with one secondary constructor
class Print {
    constructor(a: Int, b: Int) {
        println("$a, $b \n")
    }
}

// class with two or more secondary constructors
class Add {
    constructor(a: Int, b: Int) {
        println("${a + b} \n")
    }

    constructor(a: Int, b: Int, c: Int) {
        println("${a + b + c} \n")
    }

    constructor(a: Int, b: Int, c: Int, d: Int) {
        println("${a + b + c + d} \n")
    }
}

// Calling one secondary constructor from another
class Add2 {
    constructor(a: Int, b: Int) {
        println(a + b)
    }

    constructor(a: Int, b: Int, c: Int) : this(a, b) {
        println(a + b + c)
    }
}

// Calling primary constructor to secondary constructor with default value
class Std(name: String) {
    var id: Int = 0

    init {
        println("Name: $name \nAge: $id \n")
    }

    constructor(name: String, id: Int) : this(name) {
        this.id = id
        println("Name: $name \nAge: $id \n")
    }
}

fun main() {
    val p = Print(2, 4)

    val a1 = Add(1, 2)
    val a2 = Add(1, 2, 3)
    val a3 = Add(1, 2, 3, 4)

    val a21 = Add2(1, 2)
    val a22 = Add2(1, 2, 3)

    val s1 = Std("Jett")
    val s2 = Std("Sova", 1)
}