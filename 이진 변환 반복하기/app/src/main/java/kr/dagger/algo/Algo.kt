package kr.dagger.algo

fun main() {
	val sl = Solution()
	sl.solution(s = "110010101001")
	sl.solution(s = "01110")
	sl.solution(s = "1111111")
}

class Solution {
	fun solution(s: String): IntArray {
		var conversionCount = 0
		var removeZeroCount = 0
		var copyS = s

		while (true) {
			conversionCount++
			removeZeroCount += copyS.count { it == '0' }
			copyS = copyS.replace("0", "").length.toString(2)

			if (copyS.length == 1) break
		}

		return intArrayOf(conversionCount, removeZeroCount)
	}
}