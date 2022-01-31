fun main() {
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))

    solution(array = array, commands = commands)
}

fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()

    answer = commands.map { (i, j, k) ->
        array.sliceArray(i - 1 until j).sortedArray().toList()[k - 1]
    }.toIntArray()

    return answer
}