package data_structures.dynamic_array

class DynamicArray<T>(capacity: Int) : Iterable<T?> {

    private lateinit var array: Array<T?>

    private var length = 0

    private var capacity = 0

    init {
        if (capacity < 0) {
            throw IllegalArgumentException("Illegal capacity $capactiy")
        }

        this.capacity = capacity

        array = arrayOfNulls<T>(capacity)
    }
    fun isEmpty() = (length == 0)
    fun get(index:Int): T? = array[index]
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

        val newArray = arrayOfNulls<T>(capacity)

        for (i in 0.until(capacity)) {
            newArray[i] = array[i]
        }

        array = newArray
    }

    override fun iterator(): Iterator<T?> {
        return object : Iterator<T?> {
            var index =0
            override fun hasNext() = index < length

            override fun next() :T? =  array[index++]
        }
    }

}