class Solution {
	fun solution(num1: Int, num2: Int): Int {
		return if (num1 == num2) 1 else -1
	}
}

fun main() {
	val sl = Solution()
	sl.solution(2, 3)
	sl.solution(11, 11)
	sl.solution(7, 99)
}