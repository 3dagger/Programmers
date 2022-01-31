import kotlin.math.abs

class MainClass {
}

fun main() {
    val numberArr = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5)
    val hands = "right"

    solution(numberArr, hands)
}

fun solution(numbers: IntArray, hand: String): String {
    var answer = ""

    val map = mutableMapOf(
        1 to Pair(0, 3),
        2 to Pair(1, 3),
        3 to Pair(2, 3),
        4 to Pair(0, 2),
        5 to Pair(1, 2),
        6 to Pair(2, 2),
        7 to Pair(0, 1),
        8 to Pair(1, 1),
        9 to Pair(2, 1),
        0 to Pair(1, 0),
        "*" to Pair(0, 0),
        "#" to Pair(2, 0)
    )

    var currentL: Any = "*"
    var currentR: Any = "#"

    fun Pair<Int, Int>.distance(pair: Pair<Int, Int>): Int {
        return abs(this.first - pair.first) + abs(this.second - pair.second)
    }

    for (number in numbers) {
        if (setOf(1, 4, 7).contains(number)) {
            answer += "L"
            currentL = number
        } else if (setOf(3, 6, 9).contains(number)) {
            answer += "R"
            currentR = number
        } else {
            val position = map[number]!!

            var a: Int = position.let { map[currentL]!!.distance(it) }
            var b: Int = position.let { map[currentR]!!.distance(it) }

            if (a > b) {
                answer += "R"
                currentR = number
            } else if (a < b) {
                answer += "L"
                currentL = number
            } else {
                if (hand.equals("right")) {
                    answer += "R"
                    currentR = number
                } else {
                    answer += "L"
                    currentL = number
                }
            }
        }
    }

    return answer
}