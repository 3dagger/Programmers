package kr.dagger.numbermate

import kotlin.math.min

class Solution {
	fun solution(X: String, Y: String): String {
		val xArr = Array(10) { 0 }
		val yArr = Array(10) { 0 }

		X.forEach {
			xArr[it.digitToInt()]++
		}

		Y.forEach {
			yArr[it.digitToInt()]++
		}

		val tmp = StringBuilder()
		xArr.mapIndexed { index, i ->
			min(i, yArr[index])
		}.forEachIndexed { index, i ->
			repeat(i) {
				tmp.append(index)
			}
		}

		val res = tmp.toMutableList().sortedDescending().joinToString("")

		return if (res.isEmpty()) {
			"-1"
		} else if (res.all { it == '0' }) {
			"0"
		} else {
			res
		}
	}
}

fun main() {
	Solution().solution("100", "2345")
	Solution().solution("100", "203045")
	Solution().solution("100", "123450")
	Solution().solution("12321", "42531")
	Solution().solution("5525", "1255")
}