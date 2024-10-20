fun main() {
    val N = readLine()!!.toInt()

    for (i in 1..N) {
        for (j in 0..(N - i - 1)) {
            print(" ")
        }
        print(" *")

        if (i in 2..<N) {
            for (j in 1..<i) {
                print(" +")
            }
            print(" *")
        }
        if (i == N) {
            for (j in 1 until (2 * N - 1)) {
                print(" *")
            }
        }
        println()
    }
}
