import java.util.*
import kotlin.math.ceil
import kotlin.math.roundToInt

/**
 *  개발에 필요한 일수를 구해야 함 -> (100 - progress / speeds) -> (작업량 - 작업 진도) / 작업 속도
 *  만약 일수가 소숫점으로 계산된다면 올림처리를 해줘야 됨
 *  작업 후 Queue 에 offer 연산으로 삽입 (add 연산으로 하면 용량 오류 시 throw Exception 하기 때문에 offer 연산 사용)
 *  다음으로 Queue 비어있지 않을 때까지 반복하며 Head 의 값이 다음 peek 보다 클때까지 비교 -> 앞선 기능이 다음 기능보다 일수가 작으면 먼저 배포해야 하기 때문
 *  Head 의 값이 다음 값보다 크면 count 증가 후 Queue 직접 제거(peek 연산은 데이터를 제거하지 않고 빼오는 역할만 하기 때문)
 *
 * */
fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = intArrayOf()
    val calQueue: Queue<Int> = LinkedList()

    for(i in progresses.indices) {
        calQueue.offer(ceil((100 - progresses[i]).toFloat() / speeds[i].toFloat()).roundToInt())
    }

    val result = mutableListOf<Int>()
    var count = 1

    while(!calQueue.isEmpty()) {
        val first = calQueue.poll()

        while(!calQueue.isEmpty() && first >= calQueue.peek()) {
            count++
            calQueue.remove()
        }

        result.add(count)
        count = 1
    }

    answer = result.toIntArray()
    return answer
}

fun main() {
    solution(progresses = intArrayOf(93, 30, 55), speeds = intArrayOf(1, 30, 5))
}