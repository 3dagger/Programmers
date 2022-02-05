import java.util.*

class MainClass {
}

fun main() {

}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()
    return answer
}


//fun main() {
////    solution(progresses = intArrayOf(93, 30, 55), speeds = intArrayOf(1, 30, 5))
//    solution(progresses = intArrayOf(95, 90, 99, 99, 80, 99), speeds = intArrayOf(1, 1, 1, 1, 1, 1))
//}
//
//fun solution(progresses: IntArray, speeds: IntArray): IntArray {
//    var answer = intArrayOf()
//    val queue: Queue<Int> = LinkedList<Int>()
//    val leftWorkingDay = progresses.zip(speeds).map { Math.ceil((100 - it.first).toDouble().div(it.second.toDouble())).toInt() }
//    val resultArr = mutableListOf<Int>()
//
//    queue.addAll(leftWorkingDay)
//
//    while (!queue.isEmpty()) {
//        var count = 1
//        val first = queue.poll()
//
//        while (!queue.isEmpty() && queue.peek() <= first) {
//            queue.remove()
//            count++
//        }
//
//        resultArr.add(count)
//    }
//
//    answer = resultArr.toIntArray()
//    return answer
//}