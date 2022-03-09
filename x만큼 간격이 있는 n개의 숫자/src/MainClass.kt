class MainClass {
}

fun main() {
    solution(0, 5)
    solution(4, 3)
    solution(10000000, 5)
}

fun solution(x: Int, n: Int): LongArray {
    println((1..n).map { (it * x).toLong() })

    return (1..n).map { (it.toLong() * x) }.toTypedArray().toLongArray()
}