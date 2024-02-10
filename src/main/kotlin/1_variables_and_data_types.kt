/*
    VAR(Variable)
        - It is a general variable.
        - The value of a variable that is declared using var can be changed anytime throughout the program.
        - var is also called mutable and non-final variable.

    VAL(Value)
        - The object stored using val cannot be changed, it cannot be reassigned, it is just like the final keyword in java.
        - val is immutable.
        - Once assigned the val becomes read-only.


    Once the variable "type" is initialized, it can not be changed
    e.g., var a = 1
          var a = 2   <-- allowed

          var a = 1
          var a = 2.0 <-- not allowed
 */

fun main() {
    var a = 1;
    a = 2;

    val b = 4;

    println(a);
    println(b);


//    defining variables explicitly
    var score: Int = 0;
    var temp: Double = 32.5;
    var isRaining: Boolean = false;
    var alphabet: Char = 'A';
    var message: String = "Hello world";
}