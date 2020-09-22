object ResistorColor {

    fun colorCode(input: String): Int {
        return colors().indexOf(input)
    }

    fun colors(): List<String> {
        val resistorColors = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
        return resistorColors;
    }
}