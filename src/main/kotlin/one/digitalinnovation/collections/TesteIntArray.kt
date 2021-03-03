package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // print values
    for (v in values)
        println(v)

//    // print values
//    values.forEach { println(it) }
//
//    // print values
//    values.forEach { v -> println(v) }
//
//    // print values
//    for (i in values.indices)
//        println(values[i])

    println("------------------------------")
    // sort values
    values.sort()
    values.forEach { println(it) }

}