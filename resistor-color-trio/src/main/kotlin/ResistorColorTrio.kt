import kotlin.math.pow

object ResistorColorTrio {

    fun text(vararg input: Color): String {
        //ordinal returns its position in its enum declaration
        var power = input[2].ordinal
        var resistance = (input[0].ordinal * 10 + input[1].ordinal) * 10.0.pow(power)
        
        //yellow / violet / violet
        //4*10   +    7   *  10,000,000 [10^power] = 470.000.000
        //power - 1 = 6
        //6/3 = 2 -> unit index
        //OHMS, KILOOHMS, MEGAOHMS, GIGAOHMS, TERAOHMS, PETAOHMS, EXAOHMS
        
        var unitIndex = (power - 1)/3

        //when power is less than 3 and the number is bigger than 1000, adjusts power so it has a proper unit
        if(power <= 3 && resistance > 1000){
            unitIndex = (power + 1)/3
            power = 4
        }

        val unit = Unit.values().get(unitIndex).toString().toLowerCase()

        //In case the last color is black, no zeros at the end
        if(resistance < 100)
            return "${resistance.toInt()} $unit"
        
        return "${(resistance / 10.0.pow(power - 1)).toInt()} $unit"
    }
}