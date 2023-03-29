package data_structures.dynamic_array

import java.lang.IndexOutOfBoundsException
import java.lang.StringBuilder

@Suppress("UNCHECKED_CAST")
class DynamicArray<T : Any>(capacity: Int = 10) : Iterable<T?> {

    private var array: Array<Any?>

    private var length = 0

    private var capacity = 0

    init {
        if (capacity < 0) {
            throw IllegalArgumentException("Illegal capacity $capacity")
        }

        this.capacity = capacity

        array = arrayOfNulls<Any?>(capacity)
    }
    fun isEmpty() = (length == 0)
    fun get(index:Int): T? = array[index] as T?
    fun set(index:Int, element: T) {
        array[index] = element
    }
    fun clear() {
        for (i in 0.until(capacity)) {
            array[i] = null
        }
        length = 0
    }

    fun add(element: T) {
        if (length + 1 > capacity) {
            doubleTheArray()
        }
        array[length++] = element
    }

    private fun doubleTheArray() {
        if (capacity == 0) {
            capacity = 1
        } else {
            capacity *=2
        }

        val newArray = arrayOfNulls<Any?>(capacity)

        for (i in 0.until(length)) {
            newArray[i] = array[i]
        }

        array = newArray
    }

    private fun removeAt(index: Int): T {
        if (index < 0 && index >= length) {
            throw IndexOutOfBoundsException()
        }
        val data: T = array[index] as T
        val newArray = arrayOfNulls<Any?>(length-1)
        var j = 0
        for (i in 0.until(length)) {
            if (i==index) {
                j--
            } else {
                newArray[j] = array[i]
            }
            j++
        }
        array = newArray
        capacity = --length
        return data
    }
    fun remove(element: T) : Boolean {
        for (i in 0.until(length)) {
            if (array[i] == element) {
                removeAt(i)
                return true
            }
        }
        return false
    }
    private fun indexOf(element: T): Int {
        for (i in 0.until(length)) {
            if (array[i] == element) {
                return i
            }
        }
        return -1
    }

    fun contains(element: T) = indexOf(element) != -1

    override fun iterator(): Iterator<T?> {
        return object : Iterator<T?> {
            var index =0
            override fun hasNext() = index < length

            override fun next() :T? =  array[index++] as T?
        }
    }

    override fun toString(): String {
        return if (length == 0) {
            "[]"
        } else {
            val builder = StringBuilder()
            for (i in 0.until(length-1)) {
                builder.append(array[i].toString() + ", ")
            }
            "[${builder.append(array[length-1])}]"
        }

    }

}