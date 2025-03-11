package KotlinBasics

class Song(val title : String, val artist : String, val year : Int, val playCount : Int) {
    val isPopular :() -> String = {
        if (playCount >= 1000) "Popular"
        else "Unpopular"
    }


    fun display() {
        println("$title, performed by $artist, was released in $year")
    }
}

fun main() {
    val obj = Song("Raman Andalum", "SP Balasubramaniam", 1978, 2500)
    println(obj.isPopular())
    obj.display()
}