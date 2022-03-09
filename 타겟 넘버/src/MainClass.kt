class MainClass {
}

fun main() {
//    solution(numbers = intArrayOf(1,1,1,1,1), target = 3)
    solution(numbers = intArrayOf(4, 1, 2, 1), target = 4)
}

fun solution(numbers: IntArray, target: Int): Int {
    return numbers.fold(listOf(0)) { list, i -> list.run { map { it + i } + map { it - i } } }.count { it == target }
}