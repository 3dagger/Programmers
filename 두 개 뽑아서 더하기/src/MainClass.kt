class MainClass {
}

fun main() {
    solution(intArrayOf(2, 1, 3, 4, 1))
}

fun solution(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    val arr = mutableListOf<Int>()

    numbers.forEachIndexed { index, i ->
        for (i in index + 1 until numbers.size) {
            arr.add(numbers[index] + numbers[i])
        }
    }

    answer = arr.distinct().sorted().toIntArray()

    return answer
}