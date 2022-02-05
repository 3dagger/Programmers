class MainClass {
}

fun main() {
    solution(12)
}

fun solution(n: Int): Int {
    return (1..n).filter { n % it == 1 }.sorted().first()
}