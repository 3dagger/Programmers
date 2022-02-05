import kotlin.math.pow
import kotlin.math.sqrt

class MainClass {
}

fun main() {
    solution(121)
}

fun solution(n: Long): Long {
    var answer = 0.0
    answer = if(sqrt(n.toDouble()).toString().substring(sqrt(n.toDouble()).toString().indexOf(".") + 1) != "0") {
        -1.0
    }else {
        (sqrt(n.toDouble()) + 1).pow(2)
    }
    return answer.toLong()
}