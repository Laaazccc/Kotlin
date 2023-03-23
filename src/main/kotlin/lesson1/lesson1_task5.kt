package lesson1

fun main() {
    val seconds: Short = 3204
    val minute = seconds / 60
    println("$minute:${seconds - minute * 60}")
}