class MainClass {
}

fun main() {
    solution(s = "abcde")
}

fun solution(s: String): String {
    var answer = ""

    when(s.length % 2) {
        0 -> answer = s.slice(IntRange((s.length -2)/2, ((s.length -2)/2) + 1))
        1 -> answer = s.slice(IntRange((s.length -1)/2, (s.length -1)/2 ))
    }

    return answer
}