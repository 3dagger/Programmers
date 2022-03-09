class Solution {

	fun solution(brown: Int, yellow: Int): IntArray {
		return (1..yellow)
			.first { (yellow % it == 0) && ((yellow / it + it) * 2 + 4 == brown) }
			.let { intArrayOf(yellow / it + 2, it + 2) }
	}
}

fun main() {
	Solution().solution(brown = 10, yellow = 2)
//	Solution().solution(brown = 8, yellow = 1)
//	Solution().solution(brown = 12, yellow = 4)
//	Solution().solution(brown = 24, yellow = 24)
}