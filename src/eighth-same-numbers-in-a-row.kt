fun main() {
    var prevNum = Int.MIN_VALUE
    var maxCount = 0
    var currentCount = 1

    while (true) {
        val num = readLine()!!.toInt()
        if (num == 0 && prevNum == 0) {
            break
        }
        if (num == prevNum) {
            currentCount++
        } else {
            maxCount = maxOf(maxCount, currentCount)
            currentCount = 1
        }
        prevNum = num
    }
    maxCount = maxOf(maxCount, currentCount)
    println(maxCount)
}