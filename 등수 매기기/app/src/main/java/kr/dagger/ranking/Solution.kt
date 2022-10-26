package kr.dagger.ranking

import kotlin.math.abs

class Solution {
	fun solution(score: Array<IntArray>): IntArray {

		println(score.map(IntArray::average))
		println(score.map(IntArray::average).sortedDescending())

		// Original
		// 75 70 55 65
		// 75 75 40 95 95 100 20

		// Sorted
		// 75 70 65 55
		// 100 95 95 75 75 40 20
		return score
			.map(IntArray::average)
			.map {
				score.map(IntArray::average)
					.sortedDescending()
					.indexOf(it) + 1
			}.toIntArray()
	}
}

fun main() {
	Solution().solution(score = arrayOf(intArrayOf(80, 70), intArrayOf(90, 50), intArrayOf(40, 70), intArrayOf(50, 80)))
	Solution().solution(score = arrayOf(intArrayOf(80, 70), intArrayOf(70, 80), intArrayOf(30, 50), intArrayOf(90, 100), intArrayOf(100, 90), intArrayOf(100, 100), intArrayOf(10, 30)))
}