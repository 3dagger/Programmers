class MainClass{

}

fun main() {
    solution(intArrayOf(4,5,3,2,1))
//    solution(intArrayOf(10))
//    solution(intArrayOf(10))
}

fun solution(arr: IntArray): IntArray {
    return if(arr.size == 1) intArrayOf(-1) else arr.filter { it !== arr.min() }.toIntArray()
}