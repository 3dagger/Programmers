class MainClass {
}

fun main() {
    solution(118372)
}

fun solution(n: Long): Long {
    return String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}