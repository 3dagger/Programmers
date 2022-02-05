class MainClass {
}

fun main() {
    println(solution(s = "Zbcdefg"))
}

fun solution(s: String): String = s.toMutableList().sortedDescending().joinToString(separator = "")
