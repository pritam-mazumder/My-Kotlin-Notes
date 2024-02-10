import java.util.*

/*
    Lists

        - Kotlin list is an ordered collection of items.
        - A Kotlin list can be either mutable (mutableListOf) or read-only (listOf).
        - Mutable list can be changed i.e., elements can be added/removed/replaced.
        - Immutable list can't be changed.
        - The elements of list can be accessed using indices.
        - Kotlin mutable or immutable lists can have duplicate elements.

    Array Vs List

        - In array elements can be modified.
        - In list elements cannot be modified.
 */

fun list(list: List<Int>) {
    println(list)

    // toString()
    println(list.toString())

    // Using Iterator
    val itr = list.listIterator()

    while (itr.hasNext()) {         // (ascending order)
        println(itr.next())
    }

    while (itr.hasPrevious()) {     // (descending order)
        println(itr.previous())
    }

    // Size of List
    println(list.size)

    // "in" Operator
    println(2 in list)
    println(6 in list)

    // contain()
    println(list.contains(4))
    println(list.contains(0))

    // isEmpty()
    println(list.isEmpty())

    // indexOf()
    println(list.indexOf(4))

    // get()
    println(list.get(3))

    // List Addition
    val a = listOf<Int>(1, 2, 3)
    val b = listOf<Int>(4, 5, 6)
    println(a + b)

    // List Subtraction
    val c = listOf<Int>(1, 2, 3)
    val d = listOf<Int>(1, 0, 3)
    println(d - c)

    // list[1]=100
    // updating the element of list is not allowed
}

fun mutableList(mutableList: MutableList<Int>) {
    println(mutableList)

    // toString()
    println(mutableList.toString())

    // Using Iterator
    val itr = mutableList.listIterator()

    while (itr.hasNext()) {         // (ascending order)
        println(itr.next())
    }

    while (itr.hasPrevious()) {     // (descending order)
        println(itr.previous())
    }

    // Size of List
    println(mutableList.size)

    // "in" Operator
    println(2 in mutableList)
    println(6 in mutableList)

    // contain()
    println(mutableList.contains(4))
    println(mutableList.contains(0))

    // isEmpty()
    println(mutableList.isEmpty())

    // indexOf()
    println(mutableList.indexOf(4))

    // get()
    println(mutableList.get(3))

    // List Addition
    val a = mutableListOf<Int>(1, 2, 3)
    val b = mutableListOf<Int>(4, 5, 6)
    println(a + b)

    // List Subtraction
    val c = mutableListOf<Int>(1, 2, 3)
    val d = mutableListOf<Int>(1, 0, 3)
    println(d - c)

    // modifying the element
    mutableList[4] = 10

    // adding a new element
    mutableList.add(6)

    // removing a new element
    mutableList.remove(1)
    println(mutableList)

    // Adds all the elements of the specified collection to the end of this list.
    val dummyList = listOf(1, 2, 3, 4, 5)
    mutableList.addAll(dummyList)
    println(mutableList)
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    list(list)


    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList(mutableList)
}