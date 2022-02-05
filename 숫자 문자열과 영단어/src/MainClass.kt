class MainClass {
}

fun main() {
}

fun solution(s: String): Int {
    var answer: Int = 0
    val englishVocabulary = mapOf<String, String>(
        "0" to "zero",
        "1" to "one",
        "2" to "two",
        "3" to "three",
        "4" to "four",
        "5" to "five",
        "6" to "six",
        "7" to "seven",
        "8" to "eight",
        "9" to "nine"
    )

    var convertedString = s

    englishVocabulary.forEach { (key, value) ->
        if(convertedString.contains(value)) {
            convertedString = convertedString.replace(value.toRegex(), key)
        }
    }

    answer = convertedString.toInt()

    return answer
}