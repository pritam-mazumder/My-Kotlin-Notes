/*
    Filtering Collections:
    
        - Filtering is a prominent task of collection processing.
        - The filtering conditions are defined by predicates – lambda functions that take a collection element and return true when the given element matches the predicate, and false means it doesn’t match the predicate.
 */

fun isOdd(a: Int): Boolean {
    return a % 2 == 0
}

fun main() {

    println(isOdd(4))

    val nums = listOf(1, 2, 3, 4, 5)
    val list1 = nums.filter(::isOdd)    // function calling
    println(list1)


    val agent = listOf("sova", "sage", "jett", "raze", "brim")
    println(agent.filter { it.startsWith("s") })

    val tf = listOf(true, false, true, false, true)
    println(tf.filter(fun(it: Boolean): Boolean {   // inserting functiuon directly
        return (it == true)
    }))
}