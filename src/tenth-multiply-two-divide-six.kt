fun minMovesToOne(n: Int): Int {
    var N = n
    var moves = 0

    while (N != 1) {
        if (N % 6 == 0) {
            N /= 6
        } else if (N % 3 == 0) {
            N *= 2
        } else {
            return -1
        }
        moves++
    }
    return moves
}

fun main() {
    val N = readLine()!!.toInt()
    println(minMovesToOne(N))
}
