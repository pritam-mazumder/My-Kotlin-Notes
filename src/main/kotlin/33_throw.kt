import java.lang.IllegalArgumentException

fun checkAge(age: Int) {
    if (age <= 0)
        throw IllegalArgumentException()
    else
        println("Age is $age")
}

fun main() {
//    checkAge(0)
    checkAge(10)
}