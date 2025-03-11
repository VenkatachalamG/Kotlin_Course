package KotlinBasics

//fun main() {
//    val morningNotification = 51
//    val eveningNotification = 135
//
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)
//}
//
//
//fun printNotificationSummary(numberOfMessages: Int) {
//    if (numberOfMessages > 100) {
//        println("Your phone is blowing up! You have 99+ notifications")
//    }
//    else {
//        println("You have $numberOfMessages notifications")
//    }
//}

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if (age <= 12) {
        return 15
    } else if (age in 13..60) {
        if (isMonday)
            return 25
        else
            return 30
    }
    else {
        if (age <= 100 ) {
            return 20
        }
    }
    return -1
}