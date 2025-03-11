package KotlinBasics.Variables

fun sum(message : String, vararg num : Int){
    for (nums in num) {
        println ("$message welcome $nums")
    }
}

fun main() {
    sum("Hi", 7,3,5,6,2)
}