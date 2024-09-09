fun main() {
    val array = arrayOf(1, 7, 5, 2, 6, 4, 8, 5, 9)

    println("Используя цикл for:")
    for (index in 1 until array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
    }

    println("\nИспользуя цикл while:")
    var index = 1
    while (index < array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
        index++
    }

    println("\nИспользуя оператор forEach:")
    array.slice(1 until array.size - 1)
        .forEachIndexed { index, value ->
            if (value > array[index] && value > array[index + 2]) {
                println(value)
            }
        }
}