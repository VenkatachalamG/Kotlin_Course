package KotlinBasics

//primary constructor
class Superhero(name : String, age : Int) {
    val message = "Welcome"

    //secondary constructor
    constructor(name : String, age : Int, function : String) : this(name, age) {
        println("$message, $name! Some of your details :\nAge : $age\nFunction : $function")
    }
}

fun  main() {
    val obj = Superhero("Cap", 95, "Shield/Battering Ram")
}