package KotlinBasics.HigherOrderFunc

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main() {
    //Using forEach lambda function on cookies to show how to execute a function on every item in the cookies list
    cookies.forEach {
        println("Item : ${it.name}")
    }

    //using map() to convert/transform a collection into another collection
    val menu = cookies.map {
        //first '$' is character and second '$' is variable identifier
        "${it.name} -> $${it.price}"
    }
    println("Menu : ")
    menu.forEach {
        println(it)
    }
    println("**********************")
    /* Using filter to create a subset of existing collection.
        Note :  unlike map() and forEach() it returns the same type of collection and does not transform it
     */

//    val softBaked = cookies.filter {
//        it.softBaked
//    }
//
//    println ("Try our soft-baked cookies :")
//    softBaked.forEach{
//        println("${it.name} -> ${it.price}")
//    }

    //using groupBy() to convert a list to a map() collection type

    val softBakedMap = cookies.groupBy {
        it.softBaked
    }

    val softCookie = softBakedMap[true] ?: listOf()
    val hardCookie = softBakedMap[false] ?: listOf()

    println("Our soft cookies are :")
    softCookie.forEach {
        println("${it.name} -> ${it.price}")
    }
    println("**********************")
    println("Our hard cookies are :")
    hardCookie.forEach {
        println("${it.name} -> ${it.price}")
    }
    println("--------------------------------")


    //fold() to return a single value from a collection ,i.e, calculating sum/total price of elements/items,etc
    val totalAmount = cookies.fold(0.0) {finalPrice, cookie ->
        finalPrice + cookie.price
    }
    println("Final price : $totalAmount")
    println("*********************************")


    //using sortedBy() to sort the collection via one of its properties(could be sorted by strings, numbers, etc)
    val newList = cookies.sortedBy {
        it.price
    }

//    println("To make it easy, here is the alphabetical order of the cookie list :")
//    newList.forEach {
//        println("${it.price} -> ${it.name}")
//    }

    println("To make it easy, here is the lowest to highest prices of the cookie list :")
    newList.forEach {
        println("${it.price} -> ${it.name}")
    }
}