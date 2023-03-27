import data_structures.dynamic_array.DynamicArray

fun main() {
    val newArray = DynamicArray<Int>(2)
    newArray.add(1)
    newArray.add(2)
    newArray.add(3)
    val value = newArray.get(2)
    println(value)
}