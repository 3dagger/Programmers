class MainClass {
}

fun main() {
    solution("1234")
}

fun solution(s: String): Boolean {
    return when(s.length == 4 || s.length == 6) {
        true -> s.toMutableList().filter { it.isDigit() }.size == s.length
        false -> false
    }
}