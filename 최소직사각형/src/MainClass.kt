class MainClass {
}

fun main() {
    solution(sizes = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)))
}

fun solution(sizes: Array<IntArray>): Int {
    var answer: Int = 0

    val compareMap = mutableListOf<Pair<Int, Int>>()
    val resMap = mutableListOf<Pair<Int, Int>>()

    sizes.map { compareMap.add(it[0] to it[1]) }

    compareMap.map {
        if(it.first >= it.second) resMap.add(it.first to it.second)
        else resMap.add(it.second to it.first)
    }

    answer = resMap.map { it.first }.sorted().last() * resMap.map { it.second }.sorted().last()

    return answer
}