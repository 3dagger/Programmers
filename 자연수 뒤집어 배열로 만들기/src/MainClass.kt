class MainClass {
}

fun main() {
    solution(12345)
}

fun solution(n: Long): IntArray {
    var answer = intArrayOf()

    val convert = n.toString().reversed().toMutableList()

    val b = mutableListOf<Int>()

    convert.forEach { b.add(it.toString().toInt()) }

    answer = b.toIntArray()

    return answer
}