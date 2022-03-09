class MainClass {
}

fun main() {
    solution(13, 17)
//    solution(24, 27)
}

/**
 * @author : 이수현
 * @Date : 2022/02/08 2:14 AM
 * @Description : 다른사람 풀이
 * @History :
 *
 **/
fun solution(left: Int, right: Int): Int {
    return (left..right).map { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }.sum()
}

//fun solution(left: Int, right: Int): Int {
//    val measureCount = mutableListOf<Pair<Int, Int>>()
//    val res = mutableListOf<Int>()
//    (left..right).map { x -> measureCount.add(x to (1..x).filter { x % it == 0 }.count()) }
//    measureCount.forEachIndexed { index, pair ->
//        if(pair.second % 2 != 0) {
//            res.add(pair.first * -1)
//        }else {
//            res.add(pair.first)
//        }
//    }
//    return res.sum()
//}