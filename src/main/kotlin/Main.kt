fun main(args: Array<String>) {
    val crystal = 7
    val iron = 11
    val buff = 0.2

    val extraCrystal= crystal * buff
    val extraIron = iron * buff

    println("Добыто дополнительно ${extraCrystal.toInt()} кристалической руды")
    println("Добыто дополнительно ${extraIron.toInt()} металической руды")

}