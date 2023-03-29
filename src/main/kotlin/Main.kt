import data_structures.dynamic_array.DynamicArray

fun main() {
    val newArray = DynamicArray<Int>()
    newArray.add(1)
    newArray.add(2)
    newArray.add(3)
    newArray.clear()
    newArray.add(0)
    newArray.add(9)
    newArray.add(4)
    println( newArray.toString() )
    newArray.forEach {
        println(it)
    }
    newArray.remove(1)
    newArray.remove(2)
    newArray.remove(3)

    println(newArray.isEmpty())
}