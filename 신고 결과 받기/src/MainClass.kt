class MainClass {
}

fun main() {
    solution(id_list = arrayOf("muzi", "frodo", "apeach", "neo"), report = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"), k = 2)
}

fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val reportPairList = report.distinct().map { it.split(" ").let { (f, s) -> f to s } }
    val blackList = reportPairList.groupBy(Pair<String, String>::second)
        .filter { it.value.size >= k }
        .map { it.key }
    val mainCountMap = reportPairList.groupBy(Pair<String, String>::first)
        .map { it.key to it.value.map(Pair<String, String>::second).filter(blackList::contains).size }
        .toMap()


//    println(report.map { it.split(" ") }
//        .groupBy { it[1] }
//        .asSequence()
//        .map { it.value.distinct() }
//        .filter { it.size >= k }
//        .flatten()
//        .map { it[0] }
//        .groupingBy { it }
//        .eachCount()
//        .run { id_list.map { getOrDefault(it, 0) }})


    return id_list.map { mainCountMap[it] ?: 0 }.toIntArray()
}