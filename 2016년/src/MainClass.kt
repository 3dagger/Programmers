class MainClass {
}

fun main() {
    solution(5, 24)
}

fun solution(a: Int, b: Int): String {
    val days = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
    val monthLastDays = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)


    val result = (0 until a-1).map {
        monthLastDays[it]
    }.sum() + b

    return days[result % 7]
}
