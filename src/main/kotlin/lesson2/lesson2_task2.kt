package lesson2

fun main(){

    val salaryForWorkers = 50 * 30_000
    val salaryForIntern = 30 * 20_000
    val averageSalary = (salaryForIntern+salaryForWorkers)/80

    println("ЗП постоянных сотрудников $salaryForWorkers, ЗП стажеров $salaryForIntern, Среднее зп $averageSalary")
}