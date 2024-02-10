/*
    Map is kotlin is:
        - similar to map java and
        - similar to dictionary in python
 */


fun mutableMap(mutableMap: MutableMap<Int, String>) {}

fun main() {

    // mutable map
    val agent = mutableMapOf<Int, String>()
    agent.put(1, "sova")
    agent.put(2, "sage")
    agent.put(3, "omen")
    agent[4] = "jett"
    agent[5] = "raze"
    // both are same

    println(agent)

    println(agent.get(0))
    println(agent.get(10))

    for ((key, value) in agent) {
        println("$key: $value")
    }

    // immutable map
    val map = mapOf<Int, String>(
        1 to "sova",
        2 to "sage",
        3 to "omen",
        4 to "jett",
        5 to "raze"
        // this is how to add elements in the immutable map as .put() is not supported.
    )
}