package KotlinBasics.Generics

/*without generics
class fillTheBlankQuestions {
    val ques : String,
    val ans : String,
    val difficulty : String
}

class trueOrFalseQuestions {
    val ques : String,
    val ans : Boolean,
    val difficulty : String
}

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
 */



//with generics
enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Questions<T>(val question : String, val answer : T, val difficulty : Difficulty) {
    fun display() {
        println("Question\n$question\nAnswer\n$answer\nDifficulty\n$difficulty")
        println("\n")
    }
}

fun main() {
    //without using enum, may have misspellings
    /*
    val obj = Questions("What is 2 + 2?", 4, "Easy")
    val obj2 = Questions("Is 2+2 = 4?", true, "medium")
    val obj3 = Questions("What is the answer in words of 2 to power of 2?", "Four", "hard")
     */

    //with enums
    val obj = Questions("What is 2 + 2?", 4, Difficulty.EASY)
    val obj2 = Questions("Is 2+2 = 4?", true, Difficulty.MEDIUM)
    val obj3 = Questions("What is the answer in words of 2 to power of 2?", "Four", Difficulty.HARD)
    obj.display()
    obj2.display()
    obj3.display()
}