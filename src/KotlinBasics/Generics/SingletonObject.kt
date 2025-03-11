package KotlinBasics.Generics

class Main {
    //allows us to access the props & methods from this class
    companion object Display {
        val name = "Anonymous"
        fun display() {
            println("Hi, $name")
        }
    }
}

//extension property
val Main.Display.displayMessage : String
    get() = "Hello everyone"

//extension function
fun Main.Display.calculateRadiusOfCircle(radius : Double) : Double {
    val answer = Math.PI * Math.pow(radius,2.0)
    return answer
}

fun main() {
    //able to access display method of companion object Display
    Main.display()
    println(Main.displayMessage)
    println(Main.calculateRadiusOfCircle(3.5))
}