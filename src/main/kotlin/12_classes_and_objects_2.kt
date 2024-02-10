class Student(val name: String, val age: Int) {
    fun canVote(): Boolean {
        return age > 18
    }
}

fun main() {
    val i: Int = 20
    println(i.plus(30))
    println(i.minus(10))
    println(i.times(2))
    println(i.div(2))
    println(i.toFloat())

    val a = Student("A", 20)
    val b = Student("B", 15)

    println(a.canVote())
    println(b.canVote())
}