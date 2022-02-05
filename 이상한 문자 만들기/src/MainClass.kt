class MainClass {
}

fun main() {
    solution(s = "try hello worldd aa")
    //TrY HeLlO WoRlDd Aa
}

fun solution(s: String): String {
    return s.split(" ")
        .joinToString(" ") {
            it.mapIndexed { index, c ->
                if (index % 2 == 0) c.toUpperCase() else c.toLowerCase()
            }.joinToString("")
        }
}