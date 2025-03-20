package KotlinBasics.Collections

fun main() {
    val marvelSuperHeroes = arrayOf<String>("Captain America","Iron Man", "Thor")
    val dcSuperHeroes = arrayOf("Superman","Batman", "Flash")

    val heroes = marvelSuperHeroes + dcSuperHeroes
    println(heroes.contentToString())
    println(heroes[4])
    heroes[4] = "Wonder Woman"
    println(heroes[4])
}

