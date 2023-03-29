package data_structures.doubly_linked_list


class DoublyLinkedList<T> : Iterable<T>{
    var size = 0
        private set

    private lateinit var head: Node<T>
    private lateinit var tail: Node<T>

    fun clear() {
        TODO()
    }

    fun addFirst(element: T) {
        TODO()
    }

    fun addLast(element: T) {
        TODO()
    }

    fun removeFirst(): T {
        TODO()
    }

    fun removeLast() {
        TODO()
    }

    fun peekFirst() : T {
        TODO()
    }

    fun peekLast() : T {
        TODO()
    }

    fun add(element:T) {
        TODO()
    }

    fun remove(node: Node<T>):T  {
        TODO()
    }

    fun removeAt(index: Int) : T {
        TODO()
    }

    fun remove(element: T) : Boolean {
        TODO()
    }

    fun indexOf(element: T) : Int {
        TODO()
    }

    fun contains(element: T) : Int {
        TODO()
    }

    fun isEmpty() = size == 0
    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }


    override fun toString(): String {
        TODO()
        return super.toString()
    }

}