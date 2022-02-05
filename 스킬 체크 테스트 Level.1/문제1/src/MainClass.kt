class MainClass {
}

//fun main() {
//    solution(s = "02334")
//}
//
//fun solution(s: String): Int {
//    return s.toInt()
//}

fun main() {
    solution(50)
}

fun solution(n: Int): Int {
    val resultList = mutableListOf<Int>()

    for(i in 1 until n) {
        if(n % i == 1) resultList.add(i)
    }

    return resultList.first()
}

