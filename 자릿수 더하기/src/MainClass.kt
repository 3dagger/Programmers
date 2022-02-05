class MainClass {
}

fun main() {
    solution(123)
}

fun solution(n: Int): Int {
    return n.toString().map { it.toString().toInt() }.sum()
}