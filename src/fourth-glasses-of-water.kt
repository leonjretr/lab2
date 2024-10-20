fun main() {
    val N = readLine()!!.toInt()

    if (N == 1) {
        println(0)
    }
    else if (N and (N - 1) == 0) {
        println(N - 1)
    } else {
        println("NO")
    }
}
