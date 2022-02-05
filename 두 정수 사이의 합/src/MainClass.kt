class MainClass {
}

fun main() {
//    solution(3, 5)
//    solution(3, 3)
    solution(-10000000, 10)
}

fun solution(a: Int, b: Int): Long {
    var answer: Long = 0

    when {
        a <= b -> answer = (a..b).map { it.toLong() }.sum()
        a > b -> answer = (b..a).map { it.toLong() }.sum()
    }

    return answer
}