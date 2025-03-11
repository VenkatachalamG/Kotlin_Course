package KotlinBasics

//fun KotlinBasics.main() {
//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println(offer)
//}


//fun KotlinBasics.main() {
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
//}

//fun KotlinBasics.main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = baseSalary + bonusAmount
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}

//fun KotlinBasics.main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")
//}

//fun KotlinBasics.main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = add(firstNumber, secondNumber)
//    val anotherResult = add(firstNumber, thirdNumber)
//
//    val result2 = subtract(firstNumber, secondNumber)
//    val anotherResult2 = subtract(firstNumber, thirdNumber)
//
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")
//
//    println("$firstNumber - $secondNumber = $result2")
//    println("$firstNumber - $thirdNumber = $anotherResult2")
//}
//
//fun add(number1 : Int, number2 : Int) : Int {
//    return number1 + number2
//}
//
//fun subtract (number1 : Int, number2 : Int) : Int {
//    return number1 - number2
//}

//fun KotlinBasics.main() {
//    val operatingSystem = "Linux"
//    val emailId = "abc@gmail.com"
//
//    println(welcomeMessage(operatingSystem, emailId))
//}
//
//fun welcomeMessage (os : String, email : String) : String {
//    return "There\'s been a new sign-in in a $os System from your Google Account $email"
//}

fun stepsToCalories (steps : Int) : String {
    val calories = steps * 0.04f
    return "You have walked $steps steps. So you have burnt $calories calories"
}

fun main() {
    val steps = 4000
    println(stepsToCalories(steps))
}