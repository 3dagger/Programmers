import java.lang.Long.max
import java.lang.Long.min

class MainClass {
}

fun main() {
    solution(5, 3)
}

/**
 *  가로와 세로의 길이가 같으면 x * y - x
 */
fun solution(w: Int, h: Int): Long {
    return (w.toLong() * h.toLong()) - (w.toLong() + h.toLong() - gcd(w.toLong(), h.toLong()))
}

fun gcd(w: Long, h: Long): Long {
    val maximum = max(w, h)
    val minimum = min(w, h)

    return if(minimum == 0L) {
        max(w, h)
    }else {
        gcd(minimum, maximum % minimum)
    }
}
