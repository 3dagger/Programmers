
fun main() {
//	MainClass().solution("17")
//	solution("011")
}
class Solution {
	lateinit var string: String
	lateinit var check: BooleanArray
	val answerSet = mutableSetOf<Int>()

	fun solution(numbers: String): Int {
		string = numbers
		check = BooleanArray(string.length)
		permutation(depth = 0, makerStr = "")

		return answerSet.size
	}

	fun permutation(depth: Int, makerStr: String) {
		if(depth == string.length) {
			if(makerStr == "") return
			if(isPrime(makerStr.toInt())) {
				answerSet.add(makerStr.toInt())
			}
			return
		}

		for(i in string.indices) {
			if(!check[i]) {
				check[i] = true
				permutation(depth + 1, makerStr + string[i])
				check[i] = false
				permutation(depth + 1, makerStr)
			}
		}
	}

	fun isPrime(number: Int): Boolean {
		for(i in 2..number-2) {
			if(number % i == 0) {
				return false
			}
		}
		if(number <= 1) return false
		return true
	}
}

