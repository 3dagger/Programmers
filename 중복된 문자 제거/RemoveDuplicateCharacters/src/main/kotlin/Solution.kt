class Solution {
	fun solution(my_string: String): String = my_string.toMutableList().distinct().joinToString("")
}

fun main() {
	val sl = Solution()
	sl.solution("people")
	sl.solution("We are the world")
}