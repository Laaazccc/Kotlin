package lesson2

import kotlin.math.min

fun main(){
    var hour = 9
    var minute = 39
    val travelTimeInMinute = 457
    val allMinute = hour*60 + minute + travelTimeInMinute
    hour = allMinute / 60
    minute = allMinute % 60

    println("$hour:$minute")

}