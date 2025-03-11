package KotlinBasics.Functions

fun main() {
    val coins: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, {
        "$it quarters"
    })
    val trickFunction = trickOrTreat(true) {
        "Have a cupcake!"
    }
    trickFunction()

    repeat(5) {
        treatFunction()
    }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}