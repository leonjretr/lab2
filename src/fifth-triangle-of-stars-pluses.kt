fun main() {
    val N = readLine()!!.toInt()

    var plusCount = 1

    for (i in 0 until N) {
        print(" ")
    }
    println(" *")
    for (rows in 1 until N) {
        for (spaces in 0 until N - rows - 1) {
            print(" ")
        }
        if (rows != N - 1) {
            print(" *")
            for (pluses in 0 until plusCount) {
                print(" +")
                plusCount += 2
            }
            print(" *")
        }
        if (rows == N - 1) {
            for (base in 0 until N * 2 - 1) {
                print(" *")
            }
        }
        println()
    }
    //println() // End with a new line after printing the base
}
