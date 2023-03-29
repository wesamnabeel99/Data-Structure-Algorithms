package data_structures.doubly_linked_list

data class Node<T>(
    var data : T? = null,
    var previous : Node<T>? = null,
    var next: Node<T> ?= null,
)
