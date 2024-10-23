fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..(2 * n - 1)) {
        print("*")
        for (j in (Math.abs(n - i) + 2)..n) {
            if (j == n)
                print(" *")
            else
                print(" +")
        }
        println()
    }
}

