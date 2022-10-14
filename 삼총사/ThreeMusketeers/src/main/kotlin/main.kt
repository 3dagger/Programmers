class Solution {
	fun solution(number: IntArray): Int {
		var cnt = 0
		for ((i, n) in number.withIndex()) {
			for ((j, m) in number.withIndex()) {
				for ((k, l) in number.withIndex()) {
					if ((i < j) && (j < k)) {
						if (n + m + l == 0) {
							cnt++
						}
					}
				}
			}
		}
		return cnt
	}
}

fun main() {
	val sl = Solution()
	sl.solution(
		number = intArrayOf(-2, 3, 0, 2, -5)
	)
}