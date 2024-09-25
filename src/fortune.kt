fun main () {
    var fortune: String
    var i = 1
    while (i <= 10) {
        fortune = getFortune()
        println("\nYour fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") {break}
        i += 1
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    val input = readLine()
    return input?.toIntOrNull() ?: 1
}

fun getFortune(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    val index = getBirthday() % fortunes.size
    return fortunes[index]
}