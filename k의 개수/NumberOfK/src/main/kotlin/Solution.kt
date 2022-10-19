class Solution {
	fun solution(i: Int, j: Int, k: Int): Int {
		// i 부터 j 까지 k 가 몇번 등장하는지 출력
		var cnt = 0
		for (a in i..j) {
			a.toString().forEach {
				if (it.toString() == k.toString()) cnt++
			}
		}
		return cnt
	}
}

fun main() {
	val sl = Solution()
	sl.solution(1, 13, 1)
	sl.solution(10, 50, 5)
	sl.solution(3, 10, 2)

	//6 5 0
}
