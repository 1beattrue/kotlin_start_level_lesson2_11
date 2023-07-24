fun main() {
    // дефолтные и именованные параметры
    printInfoExample("Иванов", "Иван")
    printInfo("Иванов", "Иван")

}

fun printInfoExample(lastname: String, name: String, patronymic: String) {
    println("Фамилия: $lastname")
    println("Имя: $name")
    if (patronymic.isEmpty()) return
    println("Отчество: $patronymic")
}

fun printInfoExample(lastname: String, name: String) { // перегрузка метода
    printInfoExample(lastname, name, "")
}

// а теперь сделаем это при помощи дефолтного параметра
fun printInfo(lastname: String, name: String, patronymic: String = "") {
    println("Фамилия: $lastname")
    println("Имя: $name")
    if (patronymic.isEmpty()) return
    println("Отчество: $patronymic")
}

// домашнее задание - объем параллепипеда
fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c