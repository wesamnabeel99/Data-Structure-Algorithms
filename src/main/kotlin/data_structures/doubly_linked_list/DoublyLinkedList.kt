package data_structures.doubly_linked_list


class DoublyLinkedList<T> : Iterable<T> {
    var size = 0
        private set

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun clear() {
        var trav = head
        while (trav != null) {
            val nextNode = trav.next
            trav.data = null
            trav.previous = null
            trav.next = null
            trav = nextNode
        }
        head = null
        tail = null
        size = 0
    }

    fun addFirst(element: T) {
        if (isEmpty()) {
            head = Node(data = element)
            tail = Node(data = element)
        } else {
            head?.previous = Node(data = element, next = head)
            head = head?.previous
        }
        size++
    }

    fun add(element: T) {
        if (isEmpty()) {
            head = Node(data = element)
            tail = Node(data = element)
        } else {
            tail?.next = Node(data = element, previous = tail)
            tail = tail?.next
        }
        size++
    }

    fun removeFirst(): T {
        TODO()
    }

    fun removeLast() {
        TODO()
    }

    fun peekFirst(): T {
        TODO()
    }

    fun peekLast(): T {
        TODO()
    }



    fun remove(node: Node<T>): T {
        TODO()
    }
    fun remove(element: T): Boolean {
        TODO()
    }
    fun removeAt(index: Int): T {
        TODO()
    }



    fun indexOf(element: T): Int {
        var trav = head
        var index = 0
        while (trav != null) {
            if (trav.data == element) {
                return index
            }
            trav = trav.next
            index++
        }
        return -1
    }

    fun contains(element: T): Int {
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