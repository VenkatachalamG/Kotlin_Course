package KotlinBasics.Variables

fun main() {
    //syntax for defining a variable
    /*
        SYNTAX :
            val/var <variable_name> : <Data_Type> = value
            where :
                   val/var -> for mutability
                   <variable_name> -> name of variable
                   <Data_Type> -> data type of variable
                   value : value the variable holds
     */
    val noOfMessages = 10
    println("\nYou have $noOfMessages unread messages")

    //Math operators

    val readMessages = 6
    println("You have ${noOfMessages - readMessages} unread messages")

    val photos = 100
    val deletedPhotos = 10

    println("$photos photos\n$deletedPhotos photos deleted\n${photos - deletedPhotos}")

}