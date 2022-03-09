import java.lang.Integer.max
import java.lang.Math.min
import java.util.*

class MainClass {
}


/**
 * <pre>
  *
  * </pre>
  *
  * @author : 이수현
  * @Date : 2022/02/07 1:38 AM
  * @Version : 1.0.0
  * @Description : 다른 사람의 풀이 참조
  * @History :
  *
  **/
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)

        return intArrayOf(gcd, n * m / gcd)
    }
    /**
     * @author : 이수현
     * @Date : 2022/02/07 1:37 AM
     * @Description : 꼬리 재귀함수 tailrec fun 사용
     * @History :
     *
     **/
    tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

fun main() {
    solution(3, 12)
}

fun solution(n: Int, m: Int): IntArray {
    return intArrayOf(gcd(n, m), lcm(n, m))
}

/**
 * @author : 이수현
 * @Date : 2022/02/07 1:36 AM
 * @Description : 유클리드 호제법 사용 -> 나머지 0일 때까지 재귀 함수 호출
 * @History : 
 *
 **/
fun gcd(a: Int, b: Int): Int  {
    var maximum = max(a, b)
    var minimum = min(a, b)

    if(minimum == 0)  {
        return max(a, b)
    } else {
        return gcd(minimum, maximum % minimum)
    }
}

fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}
