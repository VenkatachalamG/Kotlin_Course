package KotlinBasics.Generics

interface Progress {
    val progress : Double
    fun displayProgress()
}

class Quiz(percent : Int) : Progress {
    val percentage = percent
    override val progress: Double
        get() = (percentage.toDouble() / 50) * 100.0

    override fun displayProgress() {
        println("Your progress is :\n$progress")
    }
}

fun main() {
    //without using any extension [property like apply() and let()
    val obj = Quiz(23)
    obj.displayProgress()

    //using apply()

    Quiz(35).apply {
        displayProgress()
    }
}