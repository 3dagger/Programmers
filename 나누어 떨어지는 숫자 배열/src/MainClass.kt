class MainClass {
}

fun main() {
    solution(intArrayOf(3,2,6), 10)
}

fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()

    val divArr = arr.filter { it % divisor == 0 }
    val result = mutableListOf<Int>()

    when(divArr.isEmpty()) {
        true -> result.add(-1)
        false -> result.addAll(divArr.sorted())
    }

    answer = result.toIntArray()

    return answer
}