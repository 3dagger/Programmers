class MainClass {
}

fun main() {
    solution(4)
}

fun solution(num: Int): String {
    return if(num % 2 == 0) "Even" else "Odd"
}