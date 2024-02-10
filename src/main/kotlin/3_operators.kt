/*
    Operators
        - Arithmetic operator
        - Relation operator
        - Assignment operator
        - Unary operator
        - Logical operator
        - Bitwise operator
 */

fun main() {

//    Arithmetic operator
    var a = 20;
    var b = 4;
    println("a + b = " + (a + b));
    println("a - b = " + (a - b));
    println("a * b = " + (a * b));
    println("a % b = " + (a % b));
    println("a / b = " + (a.toFloat() / b)); // to convert the int into float

//    Relation operator
    var c = 30
    var d = 40
    println("c > d = " + (c > d))
    println("c < d = " + (c < d))
    println("c >= d = " + (c >= d))
    println("c <= d = " + (c <= d))
    println("c == d = " + (c == d))
    println("c != d = " + (c != d))

//    Assignment operator
    var f = 10
    var g = 5
    f += g
    println(f);
    f -= g
    println(f);
    f *= g
    println(f);
    f /= g
    println(f);
    f %= g
    println(f);

//    Unary operator
    var e = 10
    println(e++);
    println(++e);
    println(e--);
    println(--e);

//    Logical operator
    println(50 > 5 && 50 > 10); // AND Operator
    println(50 > 5 && 50 > 90);

    println(50 > 5 || 50 > 10); // OR Operator
    println(50 > 5 || 50 > 90);

    println(!(5 == 3));  // NOT Operator
    println(!(5 > 3));


//    Short Circuiting
    var i = 10
    var j = 11

    var result = i == 11 || j++ == 11
    println(i)
    println(j)

}