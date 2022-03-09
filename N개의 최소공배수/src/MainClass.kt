class MainClass {
}

fun main() {
//    solution(intArrayOf(2, 6, 8, 14))
    solution(intArrayOf(1, 2, 3))
//    solution(intArrayOf(100, 99, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100))
}

fun solution(arr: IntArray): Int {
    val max = arr.max()!!

    for(i in max..1000000000) {
        var count = 0
        for(j in arr) {
            if(i % j == 0) {
                count++
            }
            if(count == arr.size) {
                return i
            }
        }
    }
    return  -1
}
