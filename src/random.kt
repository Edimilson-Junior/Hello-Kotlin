import kotlin.random.Random

fun main() {
    val rollDice = { sides: Int ->
        if (sides > 0) {
            Random.nextInt(1, sides+1)
        } else {
            0
        }
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides > 0) {
            Random.nextInt(1, sides+1)
        } else {
            0
        }
    }

    fun gamePlay(diceRoll: Int){
        println("The game result is $diceRoll")
    }

    gamePlay(rollDice2(12))
    println("Using an 12 sides dice: ${rollDice(12)}")
    println("Using an 100 sides dice: ${rollDice(100)}")
    println("Using an 0 sides dice: ${rollDice(0)}")

    println("Using an 12 sides dice: ${rollDice2(12)}")
    println("Using an 100 sides dice: ${rollDice2(100)}")
    println("Using an 0 sides dice: ${rollDice2(0)}")
}