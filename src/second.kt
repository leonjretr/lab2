fun main() {
    val (H, M) = readLine()!!.split(" ").map { it.toInt() }
    val N = readLine()!!.toInt()

    var hours = H
    var minutes = M

    for (i in 1..N) {

        println(String.format("%02d:%02d", hours, minutes))

        minutes += 5

        if (minutes >= 60) {
            hours += minutes / 60
            minutes %= 60
        }

        if (hours >= 24) {
            hours %= 24
        }
    }
}