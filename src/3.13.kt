fun main() {
    println("How is your mood today?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24): String {

    return when {
        goForAWalk(mood, weather) -> "Go for a walk!"
        stayInBed(mood, weather, temperature) -> "Stay in bed"
        goSwimming(temperature) -> "Go swimming"
        else -> "Stay home and read."
    }
}

fun goForAWalk(mood: String, weather: String) = mood == "Happy" && weather == "Sunny"
fun stayInBed(mood: String, weather: String, temperature: Int) = mood == "Sad" && weather == "Rainy" && temperature <= 15
fun goSwimming(temperature: Int) = temperature > 35