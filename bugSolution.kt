fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    //Handling the empty list case explicitly
    val anotherEmptyList = emptyList<Int>()
    val safeResult = if(anotherEmptyList.isEmpty()){
        emptyList<Int>()
    } else {
        anotherEmptyList.map { it * 2 }
    }
    println(safeResult) // Output: []
}