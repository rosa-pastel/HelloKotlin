//Top level variables
val name: String = "Zeynep"
var greeting: String = "Hello"

//Types in Kotlin are non-null by default
//contrary to Java.
//val name2: String = null
//gives an error.

val name2: String? = null
//does not.

//Kotlin can recognize type of the variables.
val name3 = "Nate"

//name3 = null gives an error
//Because Kotlin thought it was of Script type.
//val name3 = null
//also gives an error because Kotlin can't recognize the type.
var name4: String? = null
//is fine.

fun main() {
    val greetingToPrint = if(greeting == null) greeting else "Hola"
    name4 = when (name4){
        null -> "Rosalia"
        else -> name4
    }
    when(greetingToPrint){
        null -> println("Hi")
        else -> println(greetingToPrint)
    }
    if(name4 != null) {
        println(name4)
    }
    else {
        println(name2)
    }
}