import java.util.*

fun main() {
    // implicitly declaration of an array type
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2 = arrayOf("one", "two", "three", "four", "five")

    // explicit declarations of an array type
    var arr3 = arrayOf<Int>(1, 2, 3, 4, 5)


    // printing elements of an array
    for (i in arr1) {
        println(i)
    }
    // or
    println(Arrays.toString(arr1))


    // printing elements with index of an array
    for ((index, element) in arr2.withIndex()) {
        println("$index: $element")
    }


    // printing elements with specific index
    println(arr1[0])
    println(arr1[2])
    // or
    println(arr1.get(4))
    println(arr1.get(4))


    // modifying element of array
    arr1.set(0, 10)
    println(Arrays.toString(arr1))


    // array size
    println(arr1.size)
}