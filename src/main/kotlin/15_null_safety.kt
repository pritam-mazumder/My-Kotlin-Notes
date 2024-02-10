/*

    Null Safety

        - Kotlin null safety is a procedure to eliminate the risk of null reference from the code.
        - Kotlin compiler throws 'NullPointerException' immediately if it found any null argument is passed without executing any other statements.
        - Kotlin's type system is aimed to eliminate 'NullPointerException' form the code.

        - NullPointerException can only possible on the following causes:
            - A forceful call to throw NullPointerException();
            - An uninitialized of this operator which is available in a constructor passed and used somewhere.
            - Use of external java code as Kotlin is a Java interoperability.

        Types of null safety operators to avoid NullPointerException() and error safe:
            - ?.            Safe call operator
            - ?:            Elvis operator
            - !!            Not-null assertion
            - ?.let{}       Safe call with let

 */

fun main() {

    val name1: String = "sova"
    val name2: String? = null

//    1. Safe call (?.)
    // returns the length if 'name' is not null else returns "null"
    println("name1 Length = ${name1.length}")
    println("name2 Length = ${name2?.length}")

//    2. Safe call with let (?.let{})
    // It execute the block ONLY IF the name is NOT NULL
    name1.let { println("name1 Length = ${name1.length}") }
    name2?.let { println("name2 Length = ${name2.length}") }

//    3. Elvis operator (?:)
    // when we have nullable reference 'name', we can say "is name is not null",
    // use it, otherwise use some not-null values
    var l1 = if (name1 != null)
        name1.length
    else
        -1
    println(l1)
    // OR
    var l2 = name2?.length ?: -1
    println(l2)

//    4. Non-null assertion operator (!!)
    // use it when you are sure the value is NOT NULL
    // throws NullPointerException() if the value is found to be NULL
    println("name1 Length = ${name1!!.length}")
    println("name2 Length = ${name2!!.length}")

}
