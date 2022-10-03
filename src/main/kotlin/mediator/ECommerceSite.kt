package mediator

class ECommerceSite(
    private val stock: HashMap<String, Int> = HashMap<String, Int>().apply {
        this["pens"] = 100
        this["pencils"] = 50
        this["erasers"] = 75
    }
) {
    fun checkInStock(item: String, quantity: Int): Boolean {
        return stock.containsKey(item) && stock[item]!! > quantity
    }

    fun sell(item: String, quantity: Int) {
        val newQuantity = stock["pens"]!!.minus(quantity)
        stock[item] = newQuantity
    }
}
