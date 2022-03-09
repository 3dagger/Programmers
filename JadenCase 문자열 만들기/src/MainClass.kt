class MainClass {
}

fun main() {
//    solution("3people unFollowed me")
    solution("for the last weEk")
}

fun solution(s: String): String = s.toLowerCase().split(" ").joinToString(" ") { it.capitalize() }
