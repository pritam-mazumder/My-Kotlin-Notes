/*
    Escaped string
        - Escaped string is declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' etc.

    Raw string
        - Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape characters.

    String templates
        - String literals may contain template expressions – pieces of code that are evaluated and whose results are concatenated into the string.
        - A template expression starts with a dollar sign ($) and consists of either a name:
                val i = 10
                println("i = $i")
                // Prints "i = 10"
          or an expression in curly braces:
                val s = "abc"
                println("$s.length is ${s.length}")
                // Prints "abc.length is 3"



 */

fun main() {

//    Escaped string
    val escapedString = "I am escaped String!\n"
    print(escapedString)

//    Raw Strings
    val rawString = """This is going to be a
   multi-line string and will
   not have any escape sequence"""
    println(rawString)


//    String Templates
    val name1: String = "Brim Stone"
    println("$name1")
    println("${name1.length}")

    val n = 100
    println("$n if ${if (n > 0) "Positive" else "Negative"} number")


    val name2: String = "Brim Stone"

//    String Indexes
    println(name2[3])
    println(name2[6])

//    String Length
    println(name2.length)
    println(name2.count())

//    Last Index
    println(name2.lastIndex)

//    Changing Case of Strings
    println(name2.lowercase())
    println(name2.uppercase())

//    String Concatenation
    val name3: String = "Controller"
    println(name3 + name2)

//    Trim Characters
    println(name2.drop(2))
    println(name2.dropLast(2))

//    Finding a String inside a String
    println(name2.indexOf("Brim"))

//    getOrNull() function
    println(name2.getOrNull(0))
    println(name2.getOrNull(4))
    println(name2.getOrNull(12))
}
