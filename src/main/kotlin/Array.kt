/**
 *
 * @author Matthias.Flueckiger
 */

fun main() {
    val food = arrayOf("orange", "banana", "cherry", "blueberry")

    // Java for loop
    for (food in food){
        println(food)
    }

    //
    food.forEach{
        println(it)
    }

    //
    food.forEach{ food ->
        println(food)
    }

    //
    food.forEachIndexed{ index, food ->
        println("$food is at index $index")
    }
}

