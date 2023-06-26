fun main() {
    println(selectionSort(intArrayOf(5, -1, -66, 3, 6, 2, 10, 1, 100, Int.MIN_VALUE, 10, 2, 500, Int.MAX_VALUE)).contentToString())
}

fun selectionSort(arr: IntArray): IntArray {
    val newArr: IntArray = IntArray(arr.size)
    for (i in arr.indices) {
        val smallest = findSmallest(arr)
        newArr[i] = arr[smallest]
        arr[smallest] = Int.MAX_VALUE
    }
    return newArr
}

fun findSmallest(arr: IntArray): Int{
    var smallest = arr[0]
    var smallestIndex = 0
    for (i in arr.indices) {
        if (arr[i] < smallest) {
            smallest = arr[i]
            smallestIndex = i
        }
    }
    return smallestIndex
}