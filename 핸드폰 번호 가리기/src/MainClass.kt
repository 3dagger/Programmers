class MainClass {
}

fun main() {
    solution("01033334444")
//    solution("027778888")
}

fun solution(phone_number: String): String {
    return phone_number.mapIndexed { index, char ->
        if (phone_number.length - 5 < index ) char else "*"
    }.joinToString("")
}