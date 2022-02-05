class MainClass {
}

fun main() {
//    solution(arrayOf("sun", "bed", "car"), 1)
    solution(arrayOf("abce", "abcd", "cdx"), 2)
}

fun solution(strings: Array<String>, n: Int): Array<String> {
    val pairList = mutableListOf<Pair<Char, String>>()
    strings.map { pairList.add(it[n] to it) }

    return pairList.groupBy { it.first }
        .toSortedMap()
        .map { it.value.sortedBy { it.second } }
        .flatten()
        .map { it.second }
        .toTypedArray()
}