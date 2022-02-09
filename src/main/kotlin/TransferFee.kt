fun main() {
    val amount = 1354050
    val fee: Double = (amount * 0.75) / 100
    if (fee <= 3500) {
        println("Комиссия 3500 копеек")
    } else {
        println("Комиссия " + Math.round(fee) + " копеек")
    }
}

