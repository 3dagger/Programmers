import java.util.*

/**
 * PriorityQueue (우선순위 큐)를 사용하여 내림차순으로 정렬
 * 우선순위 정수배열을 printerQueue 에 offer  -> 내림차순으로 정렬
 * 큐가 비어있지 않거나 정답을 찾기 전까지 반복
 * 우선순위 배열의 i 와 printerQueue 의 HEAD 부분이 만나면 정답을 + 1 증가시킨다
 */
fun solution(priorities: IntArray, location: Int): Int {
    var answer = 1
    val printerQueue: PriorityQueue<Int> = PriorityQueue(Comparator.reverseOrder<Int>())

    priorities.map { printerQueue.offer(it) }

    while (!printerQueue.isEmpty()) {
        for(i in priorities.indices) {
            if(priorities[i] == printerQueue.peek()) {
                if(location == i) {
                    return answer
                }
                answer++
                printerQueue.poll()
            }
        }
    }
    return answer
}

fun main() {
    val tcPriorities = intArrayOf(2, 1, 3, 4, 5)
    val location = 2

    solution(priorities = tcPriorities, location = location)
}