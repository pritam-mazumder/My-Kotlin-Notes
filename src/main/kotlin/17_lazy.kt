/*
    Lazy Initialization

        - It was designed to prevent unnecessary initialization of objects.
        - Variables will not be initialized unless it is used in the code.
        - It is initialized once.
        - Next time when it is being used, it'll get the values from the cache memory.

        - It is thread safe.
        - It is initialized in the thread where it is used for the first time.
        - Other threads use the same value stored in the cache.

        - The variable can be used with var or val.
        - The variable can be nullable or non-nullable

 */

val pi: Float by lazy {
    3.14f
}

fun main() {
    val areaOfCircle1 = pi * 2 * 4
    val areaOfCircle2 = pi * 4 * 6

    println(areaOfCircle1)
    println(areaOfCircle2)
}