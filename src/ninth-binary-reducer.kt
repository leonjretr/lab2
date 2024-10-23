fun main() {
    val N = readLine()!!.toInt()
    val M = readLine()!!.toInt()

    var n = N
    val operations = mutableListOf<String>()

    while (n > M) {
        if (n % 2 == 0 && n / 2 >= M) {
            n /= 2
            operations.add(":2")
        } else {
            n -= 1
            operations.add("-1")
        }
    }
    for (operation in operations) {
        println(operation)
    }
}
