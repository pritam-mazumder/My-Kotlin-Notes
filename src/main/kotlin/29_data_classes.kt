/*
    Data classes:

        - Data classes in Kotlin are classes whose main purpose is to hold data.
        - Data classes come automatically with additional member functions:
            equals()
            hashCode()
            toString()
            copy()
 */

data class User(var name: String, var id: Int) {

}

fun main() {
    var user1 = User("a", 1)
    var user2 = User("a", 1)

//    println(user1)
//    println(user2)
//
//    println(user1.hashCode())
//    println(user2.hashCode())
//
//    println(user1 == user2)

    var user3 = user1.copy()
    println(user3 == user1)

    // changing the value (single or multiple doesn't matter)
    var user4 = user1.copy(name = "b")
    println(user4)

    // destructuring
    var (name: String, id: Int) = user1
    println(name)
    println(id)

    println(user1.component1())
    println(user1.component2())
}