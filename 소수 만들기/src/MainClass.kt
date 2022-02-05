class MainClass {
}

fun main() {
    solution(intArrayOf(1,2,3,4))
//    solution(intArrayOf(1,2,7,6,4))
}

fun isPrime(n: Int): Boolean {
    if(n<2)return false
    else if(n<6){ return n != 4 }
    for (i in 2..Math.sqrt(n.toDouble()).toInt()){
        if(n%i==0)return false
    }
    return true
}
fun solution(nums: IntArray): Int {
    var answer = 0
//    println(nums.size)
    for (i in 0..nums.size-3){
        for(j in i+1..nums.size-2){
            for(k in j+1..nums.size-1){
                if(isPrime(nums[i]+nums[j]+nums[k]))answer++
            }
        }
    }

    return answer
}