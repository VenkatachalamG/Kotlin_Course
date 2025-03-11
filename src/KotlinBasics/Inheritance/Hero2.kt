package KotlinBasics.Inheritance

class MarvelHero(name : String, age : Int) {
    val hName = name
    val hAge = age

    fun marvelHero () {
        println ("Hero of marvel")
    }
}

class DCHero(name : String, age : Int) {
    val hName = name
    val hAge = age

    fun dcHero () {
        println ("Hero of DC")
    }
}

class Hero(val mHero : MarvelHero) {
    fun display() {
        println("${mHero.hName}\n${mHero.hAge}")
        mHero.marvelHero()
    }
}

fun main() {
    val obj = Hero(MarvelHero("Captain America",95))
    obj.display()
}