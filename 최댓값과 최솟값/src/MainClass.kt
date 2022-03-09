class MainClass {
}

fun main() {
//    solution("0 1 4 3 2")
//    solution("-1 0 -2 -5 -4 -3")
    solution("1 0 3 2 5 9 6")
}

/**
 *  1. 전부 양수일 경우
 *  2. 전부 음수일 경우
 *  3. 양수 음수 섞여잇을 경우
 */
fun solution(s: String): String = s.split(" ").map { it.toInt() }.let { "${it.min()} ${it.max()}" }