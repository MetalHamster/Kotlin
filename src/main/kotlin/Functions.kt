/**
 *
 * @author Matthias.Flueckiger
 */

// Top level functions

// returns String
fun getName():String{
    return "Matthias"
}

// Single line // No Type definition needed
fun getName2() = "Matthias"

// returns nothing
fun sayHello(){
    println("Hello")
}

// Parameters
fun sayHello2(greeting:String, greetVal:String) = println("$greeting $greetVal")


fun main(){
    sayHello2("Hello","World")
}