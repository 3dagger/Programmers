class MainClass {
}

fun main() {
    solution(numbers = intArrayOf(5,8,4,0,6,7,9))
}

fun solution(numbers: IntArray): Int {
    var answer: Int = 0

    val list = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    val diff = list.toSet() - numbers.toSet()

    diff.forEach{
        answer += it
    }

    return answer
}