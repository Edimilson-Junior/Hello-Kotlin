package Aquarium.Decorations

fun main () {
    makeDecorations()
}

fun makeDecorations() {

    val d1 = Decorations("garnite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1)
    println(d2)
    println(d3)

    println(d1.equals(d2))
    println(d3.equals(d2))

    val d4 = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks:String) {}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {}

