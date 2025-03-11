package KotlinBasics

class GetterAndSetter {
    var speakerVolume :Int? = 75
        get() = field
        set(value) {
            if (value in 1..100)
            field = value
            else
                field = 0
        }
    init {
        speakerVolume = speakerVolume
    }
}

fun main() {
    val obj = GetterAndSetter()
    println(obj.speakerVolume)
}