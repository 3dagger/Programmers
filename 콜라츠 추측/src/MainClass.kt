class MainClass {
}

fun main() {
    solution(626331)
    solution(16)
    solution(626331)
}

fun solution(num: Int): Int {
    var dump = num.toLong()
    var count = 0

    while (dump > 1 && count < 500) {
        count++
        dump = if(dump % 2 == 0L) dump / 2 else dump * 3 + 1
    }

    return if(count == 500) -1 else count
}