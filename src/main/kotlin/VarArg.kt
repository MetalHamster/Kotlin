/**
 *
 * @author Matthias.Flueckiger
 */

//vararg means there is variable amount of items that follow
//That can mean that, there is none to follow
fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach{itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun main(){
    val interestingThings = arrayOf("Kotlin","Programming","Books")
    sayHello("hey")
    sayHello("Hey","you")
    sayHello("hey","you","and you over there")

    //"*" splits Strings
    sayHello("hey", *interestingThings)
}