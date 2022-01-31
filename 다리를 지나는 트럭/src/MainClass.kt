import java.util.*

fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    var answer = 0

    val bridgeQueue : Queue<Int> = LinkedList<Int>()

    val waitQueue : Queue<Int> = LinkedList()

    for(i in 0 until bridge_length) bridgeQueue.add(0)
    for(i in truck_weights) waitQueue.add(i)

    println("bridgeQueue :: $bridgeQueue\nwaitQueue :: $waitQueue")

    while (bridgeQueue.isNotEmpty()) {
        answer++
        bridgeQueue.poll()
        if(waitQueue.isNotEmpty()) {
            println(bridgeQueue.sum())
            if(bridgeQueue.sum() <= weight - waitQueue.peek()) {
                bridgeQueue.add(waitQueue.poll())
            }else {
                bridgeQueue.add(0)
            }
        }
    }

    println("answer :: $answer")
    return answer
}

fun main() {
    val bridge_length = 2
    val weight = 10
    val truck_weight = intArrayOf(7, 4, 5, 6)

    solution(bridge_length, weight, truck_weight)
}