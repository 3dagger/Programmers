class MainClass {
}

fun main() {
    solution(absolutes = intArrayOf(4,7,12), signs = booleanArrayOf(true, false, true))
}

fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 123456789

    val res = mutableListOf<Int>()

    absolutes.toMutableList().zip(signs.toMutableList()).forEach {
        if(!it.second) res.add(it.first * -1)
        else res.add(it.first)
    }

    answer = res.sum()

    return answer
}