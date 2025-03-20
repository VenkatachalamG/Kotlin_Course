package KotlinBasics.Collections

fun main() {
    val unitsOfTime = mutableSetOf("hours", "minutes","seconds")
    if (!unitsOfTime.contains("nanoseconds"))
        unitsOfTime.add("nanoseconds")
    println(unitsOfTime)
    println("seconds" in unitsOfTime)
}