
//omid sharifmehr/sharifmehr.com

fun main() {
    println("Enter the total number of purchases")
    val severalTimes = readLine()!!.toInt()
    println("Enter the number of purchases per time in order")
    val howMany = mutableListOf<Double>()
    for (i in 1..severalTimes){
        howMany.add(readLine()!!.toDouble())
    }
    println("Enter the price of each product in order")
    val price = mutableListOf<Double>()
    for (i in 1..severalTimes){
        price.add(readLine()!!.toDouble())
    }
    var sum = 0.0
    var howManySum = 0.0
    for (i in 0 until severalTimes) {
        sum += howMany[i] * price[i]
        howManySum += howMany[i]
    }
    println("Average purchase price is : " + "%,f".format(sum / howManySum))
}















