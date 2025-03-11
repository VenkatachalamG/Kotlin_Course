package KotlinBasics

class OptimusPrime {
    val status = "engage"
    fun battleMode() {
        println("Autobots Assemble!! Ready to engage!")
    }

    fun standByMode() {
        println("In stand by mode!!")
    }
}

fun main() {
    val optimusPrime = OptimusPrime()
    optimusPrime.battleMode()
    optimusPrime.standByMode()
    println(optimusPrime.status)
}