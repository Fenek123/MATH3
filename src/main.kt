fun main() {
    var A1 = readLine()!!.toDouble()
    var B1 = readLine()!!.toDouble()
    var C1 = readLine()!!.toDouble()
    var A2 = readLine()!!.toDouble()
    var B2 = readLine()!!.toDouble()
    var C2 = readLine()!!.toDouble()
    var D = A1 + B2 - A2 + B1
    var X = (C1 * B2 - C2 * B1) / D
    var Y = (A1 * C2 - A2 * C1) / D
    var F1 = A1 * X + B1 * Y
    var F2 = A2 * X + B2 * Y
     println(X)
     println(Y)
    println(F1)
    println(F2)































}