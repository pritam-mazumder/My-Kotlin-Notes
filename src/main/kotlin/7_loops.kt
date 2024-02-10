fun main() {

//    while loop
    var a = 2
    var i = 0
    while (i <= 10) {
        println(a * i)
        i++
    }


//    do while loop
    var k = 0
    do {
        println(k)
        k++
    } while (k < 5)
    println()


//    for loop
    for (i in 1..5) {
        println(i)
    }

    // for (int i = 0; i <= 5; i++)
    // i++ (increment by 1)(default)


    for (i in 1 until 5) {
        println(i)
    }
    // for (int i = 0; i < 5; i++)
    // i++ (increment by 1)(default)


    for (i in 1..5 step 2) {
        println(i)
    }
    // for (int i = 0; i <= 5; i=+2)
    // i=+2 (increment by 2)


    for (i in 5 downTo 1) {
        println(i)
    }
    // for (var i = 0 i >= 5; i--)
    // i-- (decrement by 1)(default)


    for (i in 5 downTo 1 step 2) {
        println(i)
    }
    // for (var i = 0 i >= 5; i=-2)
    // i=-2 (decrement by 2)


//    table of 2
    val number = 2
    for (i in 1..10) {
//        println(number.toString() + " x " + i + " = " + (i * number))
        println("$number x $i = ${i * number}")     // string templating
    }
}