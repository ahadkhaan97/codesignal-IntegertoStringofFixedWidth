fun main() {
    print(solution(1234, 4))
}

fun solution(number: Int, width: Int): String {
    var numberString = number.toString()
    if (numberString.length > width) {
        return numberString.substring(numberString.length - width, numberString.length)
    }
    if (numberString.length < width) {
        for (i in numberString.length until width) {
            numberString = "0$numberString"
        }
        return numberString
    }
    return numberString
}
