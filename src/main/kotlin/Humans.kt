import kotlin.random.Random

fun main() {
    val likes = Random.nextInt(0, 9999)
    if (likes % 100 == 11) {
        println("Понравилось " + likes + " людям")
    } else if (likes % 10 == 1) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " людям")
    }
}