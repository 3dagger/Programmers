class MainClass {
}

fun main() {
    val n = 5
    val lost = intArrayOf(2, 4)
    val reserve = intArrayOf(1, 3, 5)

    solution(n, lost, reserve)
}

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

    var answer = n
    val lostSet = lost.toSet() - reserve.toSet()
    val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

    for (i in lostSet) {
        when {
            i + 1 in reserveSet -> reserveSet.remove(i + 1)
            i - 1 in reserveSet -> reserveSet.remove(i - 1)
            else -> answer--
        }
    }

    return answer
}
