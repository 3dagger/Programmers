class MainClass {
}

fun main() {
    solution("AB", 1)
}

fun solution(s: String, n: Int): String =
    s.toList().joinToString(separator = "") {
        when (it) {
            in 'A'..'Z' -> ('A'.toInt() + (it.toInt() - 'A'.toInt() + n) % ('Z' - 'A' + 1)).toChar()
            in 'a'..'z' -> ('a'.toInt() + (it.toInt() - 'a'.toInt() + n) % ('z' - 'a' + 1)).toChar()
            else -> it
        }.toString()
    }