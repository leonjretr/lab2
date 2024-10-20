fun main() {
    val H = readLine()?.toIntOrNull() ?: return

    if (H <= 0 || H >= 2_000_000_000) {
        println("H is out of bounds")
        return
    }

    val binaryString = Integer.toBinaryString(H)

    val zeroCount = binaryString.count { it == '0' }

    println(zeroCount)
}