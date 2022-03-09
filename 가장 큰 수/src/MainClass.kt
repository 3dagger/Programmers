import java.util.*

class MainClass {
}

fun main() {
    solution(numbers = intArrayOf(6, 10, 2))
//    solution(numbers = intArrayOf(3, 30, 34, 5, 9))


}

/**
 * @author : 이수현
 * @Date : 2022/02/21 9:04 PM
 * @Description : 다른 사람의 풀이
 * @History :
 *
 **/
fun solution(numbers: IntArray): String {
    var answer = ""
    numbers.sortedWith(Comparator { num1: Int, num2: Int -> "$num2$num1".compareTo("$num1$num2") }).forEach { answer += it }
    if ("(0*)".toRegex().replace(answer, "").isEmpty()) {
        answer = "0"
    }

    return answer
}

//fun solution(numbers: IntArray): String {
//    var answer = "0"
//
//    var temp = arrayOf<String>()
//    numbers.forEach {
//        temp += it.toString()
//    }
//
//    temp.sortWith(Comparator { o1, o2 ->
//        when (o1.length) {
//            o2.length -> o2.compareTo(o1)
//            else -> (o2+o1).compareTo(o1+o2)
//        }
//    })
//
//    if(temp[0]=="0") {
//        return answer
//    }else {
//        answer = ""
//        temp.forEach {
//            answer += it
//        }
//    }
//
//
//    return answer
//}