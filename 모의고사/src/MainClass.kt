fun main() {
    val answersArr = intArrayOf(1,2,3,4,5)
//    val answersArr = intArrayOf(1,3,2,4,2)

    solution(answersArr)
}

fun solution(answers: IntArray): IntArray {
    var answer = intArrayOf()

    val score = IntArray(3)
    val firstMathGiveUpMan = intArrayOf(1, 2, 3, 4, 5)
    val secondMathGiveUpMan = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val thirdMathGiveUpMan = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    answers.mapIndexed { index, it ->
        if(it == firstMathGiveUpMan[index % firstMathGiveUpMan.size]) score[0]++
        if(it == secondMathGiveUpMan[index % secondMathGiveUpMan.size]) score[1]++
        if(it == thirdMathGiveUpMan[index % thirdMathGiveUpMan.size]) score[2]++
    }

    val makeReturnArr = arrayListOf<Int>()

    score.mapIndexed { index, it ->
        if(score[index] == score.sorted().last()) makeReturnArr.add(index + 1)
    }

    answer = makeReturnArr.sorted().toIntArray()

    return answer
}