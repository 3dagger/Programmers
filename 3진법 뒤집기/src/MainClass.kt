import kotlin.math.pow

class MainClass {
}

fun main() {
//    solution(45)
    solution(125)
}

fun solution(n: Int): Int {
    return n.toString(3).reversed().toInt(3)
}