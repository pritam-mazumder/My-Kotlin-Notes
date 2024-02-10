/*
    Inline Function

        - An inline function is declare with a keyword inline.
        - The use of inline function enhances the performance of higher order function.
        - The inline function tells the compiler to copy parameters and functions to the call site.

    Advantage of inline function:

        Function call overhead doesn't occur. Less overhead and faster program execution.

        So, when to make the function inline and when not:

        When the function code is very small, it's a good idea to make the function inline.
        When the function code is large and called from so many places, it's a bad idea to make the function inline, as the large code will be repeated again and again.
 */

fun loop(n: Long) {
    for (i in 1..n) {
        //
    }
}

inline fun timeTaken(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println(end - start)

}

fun main() {
    timeTaken { loop(100) }
    timeTaken { loop(100) }
    timeTaken { loop(100) }
}
