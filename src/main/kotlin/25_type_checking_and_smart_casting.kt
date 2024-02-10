fun main() {

//    Type Checking

    val name = "Sova"
    val age = 24
    val salary = 10000.00
    val empDetails = arrayOf(name, age, salary)

    for (element in empDetails) {
        when (element) {
            is String -> println("Name: $element")
            is Int -> println("Age: $element")
            is Double -> println("Age: $element")
            else -> println("Nor an attribute")
        }
    }

//    Smart Cast
    val string: Any = "A"
    val int: Any = 20
    val double: Any = 30.0
    val boolean: Any = true

    val arrayData = arrayOf(string, int, double, boolean)

    for (element in arrayData) {
        when (element) {
            is String -> println("$element is string")
            is Int -> println("$element is int")
            is Double -> println("$element is double")
            is Boolean -> println("$element is boolean")
        }
    }
}