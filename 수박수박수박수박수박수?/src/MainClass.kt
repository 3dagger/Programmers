class MainClass {
}

fun main() {
    solution(7)
}

fun solution(n: Int): String = when(n%2 == 0) {
    true    -> "수박".repeat(n/2)
    false   -> "수박".repeat(n/2) + "수"
}






