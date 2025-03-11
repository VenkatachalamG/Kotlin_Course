package KotlinBasics.Inheritance

open class Superheroes(name : String, age : Int) {
    val name = name
    val age = age
    fun display() {
        println("Hero Name : $name\nAge : $age")
    }
}

class MarvelUniverse(heroName : String, heroAge: Int, universe : String) : Superheroes(name = heroName, age = heroAge) {
    val universe = universe
    fun display2() {
        this.display()
        println("From $universe Universe")
    }
    fun creator() {
        println("Stan Lee")
    }
}

class DCUniverse(heroName: String, heroAge: Int,universe: String) : Superheroes(name = heroName, age = heroAge) {
    val universe = universe
    fun display2() {
        this.display()
        println("From $universe Universe")
    }
    fun creator() {
        println("James Gunn")
    }
}

fun main() {
    val obj = MarvelUniverse("Steve Rogers", 106, "MCU")
    obj.display2()
    obj.creator()
    println()
    val obj2 = DCUniverse("Bruce Wayne", 53, "DCU")
    obj2.display2()
    obj2.creator()
}