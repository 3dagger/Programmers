class MainClass {
}

fun main() {
    solution(arrayOf("Jane", "df","dfdf","Kim"))
}

fun solution(seoul: Array<String>): String {
    var answer = ""
    seoul.mapIndexed { index, s -> if(s == "Kim") answer = "김서방은 ${index}에 있다" }
    return answer
}