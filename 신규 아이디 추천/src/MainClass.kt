class MainClass {
}

fun main() {
    solution("")
}

fun solution(new_id: String): String {
    var answer: String = ""

    answer = firstStep(new_id)

    return answer
}

fun firstStep(case: String): String{
    val res = case.toLowerCase()
    return secondStep(case = res)
}

fun secondStep(case: String): String{
    val res = case.replace("[^a-z0-9-_.]".toRegex(), "")
    return thirdStep(case = res)
}

fun thirdStep(case: String): String {
    val res = case.replace("[.]+".toRegex(),".")
    return fourthStep(case = res)
}

fun fourthStep(case: String): String {
    val res = case.replace("^[.]|[.]$".toRegex(),"")
    return fifthStep(case = res)
}

fun fifthStep(case: String): String {
    val res = case.ifBlank { "a" }
    return sixthStep(case = res)
}

fun sixthStep(case: String): String {
    var afterCase = case
    if(case.length >= 16) {
        afterCase = afterCase.substring(0, 15)
    }
    if(afterCase.last().toString() == ".") {
        afterCase = afterCase.replace("[.]$".toRegex(),"")
    }
    return seventhStep(case = afterCase)
}

fun seventhStep(case: String): String {
    var afterCase = case
    if(afterCase.length <= 2) {
        for(i in 0..2) {
            afterCase += case.last()
            if(afterCase.length == 3) {
                break
            }
        }
    }
    return afterCase
}