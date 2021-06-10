/**
 *
 * @author Matthias.Flueckiger
 */

fun main() {
    //Immutable Collection
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { (key, value) ->
        println("$key -> $value")
    }
    //map.add(4,"d")

}
