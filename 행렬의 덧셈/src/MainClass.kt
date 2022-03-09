class MainClass {
}

fun main() {
    solution(arrayOf(intArrayOf(1,2), intArrayOf(2,3)), arrayOf(intArrayOf(3,4), intArrayOf(5,6)))
//    solution(arrayOf(intArrayOf(1), intArrayOf(2)), arrayOf(intArrayOf(3), intArrayOf(4)))
}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.mapIndexed { index1, a ->
        a.mapIndexed { index2, b ->
            b + arr2[index1][index2]
        }.toIntArray()
    }.toTypedArray()
}