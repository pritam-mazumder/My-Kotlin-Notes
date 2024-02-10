// Primary constructor = Default constructor
// Secondary constructor = Parameterized constructor

/*
    Primary Constructor

    The primary constructor is initialized in the class header, goes after the class name, using the constructor keyword.
    The parameters are optional in the primary constructor.
 */


// Primary Constructor
class Person1(val name: String, val age: Int) {}

// Direct property declaration in primary constructor with init block
class Person2(var name: String, var age: Int) {
    init {
        println("Name: $name \nAge: $age \n")
    }
}

// Parameter, scope variable and init block (personally not recommended)
class Person3(pname: String, page: Int) {
    private val name: String  // not necessarily 'private'
    private val age: Int

    init {
        name = pname
        age = page
        println("Name: $name \nAge: $age \n")
    }
}

// Property and init block
class Person4(name: String, age: Int) {
    init {
        println("Name: $name \nAge: $age \n")
    }
}

// Default Parameter
class Person5(_name: String = "Unknown", _age: Int = 0) {
    var name: String = _name
    var age: Int = _age

    init {
        println("Name: $name \nAge: $age \n")
    }
}

// Parameter, scope variable init block and this keyword
class Person6(name: String, age: Int) {
    var name: String = ""
    var age: Int = 0

    init {
        this.name = name
        this.age = age
        println("Name: $name \nAge: $age \n")
    }
}

fun main() {

    // Primary Constructor
    val p1 = Person1("Sova", 20)
    println("Name: ${p1.name} \nAge: ${p1.age} \n")

    // Direct property declaration with init block
    val p2 = Person2("Jett", 18)

    // Parameter, scope variable, init block
    val p3 = Person3("Skye", 26)

    // Property and init block
    val p4 = Person4("Viper", 26)

    // Default Parameter
    val p50 = Person5()
    val p51 = Person5("Raze", 21)

    // Parameter, scope variable init block, this keyword
    val p61 = Person6("Omen", 28)
}

