package KotlinBasics.Collections

fun main() {
    //Lists
    val planets = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(planets.size)
//    println("Index of Earth : ${planets[2]}")
//    println("Index of Uranus : ${planets.get(6)}")
//    println("Value of Earth is at ${planets.indexOf("Earth")}")

    for (planet in planets) {
        println(planet)
    }
    println()
    //Mutable Lists

    val dishes = mutableListOf("Panneer Butter Masala", "Dosa Chutney", "Vada Sambhar", "Fried Rice")
    //only 'add' adds element at last
    dishes.add("Idli Sambhar")
    println(dishes)

    dishes.add(1, "Badam Halwa")
    println(dishes)

    println(dishes.contains("Idli Sambhar"))
    println(dishes.contains("Egg"))
}