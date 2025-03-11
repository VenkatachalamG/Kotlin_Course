package KotlinBasics

fun main() {
//    var name : String? = "Brawl Stars"
//    println(name?.length)
//    name = null
//    //null check explicitly performed
//    println(name?.length)
//
//    var name2 : String? = "Brawl Stars"
//    println(name2!!.length)

//    var name3 : String? = "Andre Adams"
//    name3 = null
//    if (name3 != null){
//        println("Length :${name3.length}")
//    }
//    else {
//        println("$name3")
//    }
//    var person : String? = "Sunil"
//    var result : String = if (person != null) "Name not null"
//    else "Null type"
//    person = null
//    var result2 : String? = if (person != null) "Name not null"
//    else "Null type"
//    println(result)
//    println(result2)

    var variable : String? = null

    var result3 = variable?.length ?: "Null type"
    println(result3)
//    var num : Int? = 43
//    println(num)
//    num = null
//    println(num)
}