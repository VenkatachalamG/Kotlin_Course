package KotlinBasics.Variables

fun main() {
    /*
      *  Wrong usage of val, have to use 'var' instead
      *  val name = "Venkat"
      *  name = "Venkatachalam"
      *  println(name)
     */
    var priceOfPetrol = 101.34f
    println("Current price of petrol $priceOfPetrol")
    priceOfPetrol /= 1.5f
    print("New price of petrol $priceOfPetrol")

    val firstName = "Venkat"
    val lastName = "Gopal"
    val fullName = "$firstName $lastName"
    println("Full name : $fullName")

    //Escape sequence for including double quotes or single quotes
    println("The name is \"$firstName\", \"$fullName\"")

    println("My name is \'John\'")
    val myAge = true
    println("Is your age above 18?\nMy answer : $myAge")
}