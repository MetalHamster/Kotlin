/**
 *
 * @author Matthias.Flueckiger
 */

fun greetPerson(greeting:String,name:String) = println("$greeting $name")

fun main(){
    greetPerson("hey","Matthias")

    //named Arguments
    greetPerson(greeting = "hey", name = "Matthias")
    //You can mix up the order and still get the same result
    greetPerson(name = "Matthias", greeting = "hey")
}