package KotlinBasics.Functions

fun main() {
//    var isSuperhero = false
//    if (45 > 24){
//        isSuperhero = true
//    }
//    else {
//        isSuperhero = false
//    }
//    println(isSuperhero)

    val trafficLight = "Green"

//    when (trafficLight) {
//        "Red" -> println("Stop")
//        "Yellow" -> println("Ready")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic light")
//    }

//    val guessedNumber = 9
//    var ans = ""
//    val result = when (guessedNumber) {
//        in 1..6 -> ans = "Guessed number is between 1 and 6"
//        in 7..10 -> ans = "Guessed number is between 7 and 10"
//        else -> ans = "Invalid guess"
//    }
//    println(ans)

    val light = "blue"
    val message = if (light == "green") "Go"
    else if (light == "blue") "Bingo"
    else "Red"

    println(message)
}