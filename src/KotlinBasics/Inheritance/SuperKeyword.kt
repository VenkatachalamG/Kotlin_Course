package KotlinBasics.Inheritance

open class SuperKeyword {
    open fun display() {
        println("This is the superclass")
    }
}

class SubClass : SuperKeyword() {
    fun display2() {
        super.display()
        println("This is a subclass")
    }
}

fun main() {
    val obj = SubClass()
    obj.display2()
}