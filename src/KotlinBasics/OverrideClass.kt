package KotlinBasics

open class OverrideClass {
    open fun display() {
        println("This is superclass")
    }
}

class OverrideSub : OverrideClass() {
    override fun display() {
        print("This is subclass")
    }
}

fun main() {
    val obj = OverrideClass()
    obj.display()

    val obj2 = OverrideSub()
    obj2.display()
}