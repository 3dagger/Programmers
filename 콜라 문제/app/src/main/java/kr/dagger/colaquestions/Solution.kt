package kr.dagger.colaquestions

class Solution {
	fun solution(a: Int, b:Int, n: Int): Int {
		var coke = n
		var numberOfBottles = 0

		while (true) {

			if (coke < a) break

			val changeCoke = (coke / a) * b
			coke = changeCoke + (coke % a)
			numberOfBottles += changeCoke
		}

		return numberOfBottles
	}
}

fun main() {
	val sl = Solution()
	sl.solution(2, 1, 20)
	sl.solution(3, 1, 20)
}