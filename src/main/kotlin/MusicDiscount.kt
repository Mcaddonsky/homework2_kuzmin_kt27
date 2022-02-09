fun main() {
    val meloman = true
    val sumOfPurchases = 12000F
    val percentDiscount = 5
    val melomanDiscount = 1
    var totalPrice = 0F
    if (sumOfPurchases <= 1_000) {
        totalPrice = sumOfPurchases
    } else if (sumOfPurchases > 1_000 && sumOfPurchases <= 10_000) {
        totalPrice = sumOfPurchases - 100
    } else if (sumOfPurchases > 10_000) {
        totalPrice = sumOfPurchases - ((sumOfPurchases * percentDiscount) / 100)
    }
    if (meloman) {
        totalPrice -= ((totalPrice * melomanDiscount) / 100)
        println("Стоимость " + totalPrice)
    } else {
        println("Стоимость " + totalPrice)
    }
}




