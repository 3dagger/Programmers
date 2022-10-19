class Solution {
	fun solution(my_str: String, n: Int): Array<String> {
		return my_str.chunked(n).toTypedArray()
	}
}

fun main() {
	val sl = Solution()
	sl.solution("abc1Addfggg4556b", 6)
	sl.solution("abcdef123", 3)
}

