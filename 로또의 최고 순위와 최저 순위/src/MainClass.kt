import java.util.*

class MainClass {
}

fun main() {
//    solution(lottos = intArrayOf(45, 4, 35, 20, 3, 9), win_nums = intArrayOf(20, 9, 3, 45, 4, 35))
    solution(lottos = intArrayOf(0, 0, 0, 0, 0, 20), win_nums = intArrayOf(20, 9, 3, 45, 4, 35))
//    solution(lottos = intArrayOf(44, 1, 0, 0, 31, 25), win_nums = intArrayOf(31, 10, 45, 1, 6, 19))
//    solution(lottos = intArrayOf(99, 98, 97, 96, 95, 94), win_nums = intArrayOf(20, 9, 3, 45, 4, 35))
}

// 1등 -> 6개 같음
// 2등 -> 5개 같음
// 3등 -> 4개 같음
// 4등 -> 3개 가음
// 5등 -> 2개 같음
// 6등 -> 1개 같음
// 6등 -> 0개 같음
fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    val answerPair = mutableListOf(1 to 6, 2 to 5, 3 to 4, 4 to 3, 5 to 2, 6 to 1, 6 to 0)
    val zeroCount = lottos.filter { it == 0 }.size
    val same = win_nums.map { a -> lottos.toMutableList().filter { it == a } }.filter { it.isNotEmpty() }.size
    val resArray = mutableListOf<Int>()

    answerPair.map {
        if(it.second == same + zeroCount) resArray.add(0, it.first)
        if(it.second == same) resArray.add(1, it.first)
    }

    return resArray.toIntArray()
}