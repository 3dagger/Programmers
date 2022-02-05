class MainClass {
}

fun main() {
    solution(2500, 1000000000, 2500)
}

fun solution(price: Int, money: Int, count: Int): Long {
    return (1..count).map { (price * it).toLong() }.sum().let { if(money > it) 0 else it - money }
}