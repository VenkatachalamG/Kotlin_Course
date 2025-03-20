package KotlinBasics.Collections

fun main() {
    //declaring
    //val heroes = mutableMapOf<Int,String>()

    //defining
    val heroes = mutableMapOf(
        1 to "Cap",
        2 to "Thor",
        3 to "Iron Man"
    )
    println(heroes)
    heroes[2] = "Falcon"
    println(heroes)
    println(heroes.get(3))
    heroes.put(5, "Vision")
    println(heroes)
}