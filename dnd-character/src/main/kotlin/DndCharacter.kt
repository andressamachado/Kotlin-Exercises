
import kotlin.math.floor
import kotlin.random.Random

class DndCharacter {
    val BASE_INITIAL_HITPOINTS = 10

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = BASE_INITIAL_HITPOINTS + modifier(constitution)

    companion object {

        fun ability(): Int {
            var diceThrow = Random

            val dices = IntArray(4) { diceThrow.nextInt(1, 6) }.asList()
            dices.sorted()
        
            return dices.takeLast(3).sum()
        }

        fun modifier(score: Int): Int {
            //floor() returns the largest double value that is smaller than or equal to the given value x and is a mathematical integer.
            return floor((score - 10.0)/2).toInt();
        }
    }

}
