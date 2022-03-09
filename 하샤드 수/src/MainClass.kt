class MainClass {
}

fun main() {
    println(solution(10))
    println(solution(12))
    println(solution(11))
    println(solution(13))
}

fun solution(x: Int): Boolean {
    return x % x.toString().toMutableList().map { it.toString().toInt() }.sum() == 0
}