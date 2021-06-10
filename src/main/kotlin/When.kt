/**
 *
 * @author Matthias.Flueckiger
 */

fun main() {
    // Using "when" as return value
    val number =1;
    var givenNum=when (number){
        1->"One"
        else -> "invalid"
    }

    println(givenNum)

    // Standalone
    when (number) {
        1-> print("One")
        else -> print("invalid")
    }

}