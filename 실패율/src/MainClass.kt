class MainClass {
}

fun main() {
    val n = 5
//    val n = 4
    val stages = intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)
//    val stages = intArrayOf(4, 4, 4, 4)

    solution(n, stages)
}

// numerator 분자 denominator 분모   분자 / 분모 임
// 실패율   -> 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
//        -> 스테이지 번호와 같은 배열의 원소의 갯수 / 스테이지 번호보다 같거나 큰 원소의 갯수
fun solution(N: Int, stages: IntArray): IntArray {
    var answer = IntArray(N)

    val idxMap: MutableMap<Int, Int> = mutableMapOf()
    val failureMap: MutableMap<Int, Double> = mutableMapOf()

    stages.forEach {
        when(idxMap.containsKey(it)) {
            true -> idxMap[it] = idxMap.getValue(it) + 1
            false -> idxMap[it] = 1
        }
    }

    var totalSize = stages.size

    for(i in 1..N) {
        when(idxMap.containsKey(i)) {
            true -> {
                failureMap[i] = (idxMap.getValue(i) / totalSize.toDouble())
                totalSize -= idxMap.getValue(i)
            }
            false -> failureMap[i] = 0.0
        }
    }

    val list = failureMap.toList().sortedByDescending { (_, value) -> value }

    for (i in 0 until N) {
        answer[i] = list[i].first
    }


    return answer
}


//var answer = intArrayOf()
//
//    val stageArray = mutableListOf<Int>()
//    (1..N).map { stageArray.add(it) }
//
//    val map = mutableMapOf<Int, Float>()
//
//    stageArray.forEachIndexed { index, a ->
//        if(a == 0) {
//            map.put(index + 1, 0.0F)
//        }else {
//            map.put(index + 1, (stages.count { it == a }).toFloat() / (stages.count { it >= a }).toFloat())
//        }
//
//    }
//
//    val aaa = map.toList().sortedByDescending { it.second }.toMap().toMutableMap()
//
//    println(aaa.keys)
//    answer = aaa.keys.toIntArray()
//
//    return answer