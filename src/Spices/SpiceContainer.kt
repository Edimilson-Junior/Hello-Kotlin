package Spices


fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("curry", "mild", YellowSpiceColor)),
        SpiceContainer(Pepper("pepper", "very spicy", RedSpiceColor)),

        )
    for (element in spiceCabinet) println("The ${element.label} is ${element.spiciness} and it's color is ${element.spiceColor}")
}

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
    val spiciness: String
        get() = spice.spiciness
    val spiceColor: String
        get() = spice.color.toString()
}

class Pepper(name: String, spiciness: String, color: SpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Griding the spice to powder")
    }
}

class Curry(name: String, spiciness: String, color: SpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Griding the spice to powder")
    }

}

