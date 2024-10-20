fun main() {
    // Read the input integer N
    val N = readLine()!!.toInt()

    val result = mutableListOf<Int>()

    var currentStep = 1
    var count = 0

    while (count < N) {
        repeat(currentStep) {
            if (count < N) {
                result.add(currentStep)
                count++
            }
        }
        currentStep++
    }

    println(result.joinToString(" "))
}
