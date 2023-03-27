package lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main(){
    val V = 70_000.0
    val P = 16.7
    val n = 20.0
    var S = 0.0


        S = (V * (1.0 + (P / 100.0)).pow(n))
        println(((S*1000).roundToInt()) / 1000.0)


    //println(S)

}