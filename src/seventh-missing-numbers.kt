fun main() {
    val N = readLine()!!

    val allDigits = ('0'..'9').toSet()

    val presentDigits = N.toSet()

    val missingDigits = allDigits - presentDigits

    if (missingDigits.isEmpty()) {
        println("0 0")
    } else {
        println(missingDigits.sorted().joinToString(" "))
    }
}
