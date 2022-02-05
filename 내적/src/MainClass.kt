class MainClass {
}

fun main() {
    solution(a = intArrayOf(1,2,3,4), b = intArrayOf(-3,-1,0,2))
}

fun solution(a: IntArray, b: IntArray): Int = a.zip(b).sumOf { it.first * it.second }