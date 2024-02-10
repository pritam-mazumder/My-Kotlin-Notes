/*
    Scoped Functions in Kotlin
    
        - Scope functions are functions that allow you to execute a block of code within a specific context, such as an object, and provide additional functionality and readability.
        - The scope functions include let, apply, run, with, and also.
 */


data class Agents3(var name: String = "", var role: String = "")

fun main() {
    val a = Agents3()

    // apply

    // normal approach
    a.name = "sova"
    a.role = "initiator"

    // with the help of scope (apply)
    // return value of apply function is "object"
    a.apply {       // 'apply' has a 'this' refetence which points to 'a' (in this case) 
        name = "jett"
        role = "duelist"
    }

    println(a)
    
    
    
    // let (lambda function)
    
    // normal apporach
    println(a.name)
    println(a.role)
    
    // with the help of scope (let)
    // return value of let function depends of the return type of last line. ('Unit' is this case)
    a.let {       // 'let' has a 'it' variable which points to 'a' (in this case) 
        println(it.name)
        println(it.role)
    }



    // with (improved version of 'let') (normal function)

    // with the help of scope (with)
    
    // you have to pass the objects manually
    // return value of let function depends of the return type of last line. ('Unit' is this case)
    with(a) {       // 'with' has a 'this' refetence which points to 'a' (in this case) 
        name = "raze"
        role = "duelist"
    }



    // run (combinatio of 'with' & 'let') (normal function)

    // with the help of scope (run)

    // return value of let function depends of the return type of last line. ('Unit' is this case)
    a.run {       // 'run' has a 'this' refetence which points to 'a' (in this case) 
        name = "sage"
        role = "sentinel"
    }
}