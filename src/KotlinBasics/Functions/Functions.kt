package KotlinBasics.Functions

//function with a return type
//fun nameOfUser (name : String) : String {
//    if (name == "Venkat")
//        return "Hello Mr.V!!"
//    return "Hello Anonymous...Greetings!!"
//}

//function without a return type
fun nameOfUser2 () : String{
    val greet1 = "Hello Mr.V!!"
    val greet2 = "Let\'s guide you through the protocols"
    return "$greet1\n$greet2"
}

fun agentIntroduction(name : String, protocol : Int) : String{
    val greet1 = "Hello, Mr.$name"
    val greet2 = "Thanks for responding to the mission call with protocol $protocol"
    return "$greet1\n$greet2"

}

//Function with default arguments
fun agentIntro(name : String, protocol : Int = 24) : String {
    return "Hello Mr.$name. Your protocol to follow is $protocol"
}
fun main() {
//    val name = "Venkat"
//    println(nameOfUser(name))
//
//    val names = "John"
//    println(nameOfUser(names))

//    val result = nameOfUser2()
//    println(result)

//    val result2 = agentIntroduction("Venkat")
    val agent = agentIntro("Venkat")
    val agent2 = agentIntro("Rajesh")
    val agent3 = agentIntro("Sampath")
    val agent4 = agentIntro("Narayanan")

    println(agent+ "\n" + agent2+ "\n" + agent3+ "\n" + agent4)

    //Specifying function arguments in a different order
    val ag = agentIntroduction(protocol = 24, name = "Venkat")
    println(ag)
    val ag1 = agentIntroduction(protocol = 42, name = "Varshini")
    println(ag1)
    val ag2 = agentIntroduction(protocol = 35, name = "Tarun")
    println(ag2)
}