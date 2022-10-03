package mediator

class Mediator(
    private val customer: Customer = Customer("123 Sunny Street"),
    private val site: ECommerceSite = ECommerceSite(),
    private val driver: Driver = Driver()
) {

    fun buy(item: String, quantity: Int) {
        if (site.checkInStock(item, quantity)) {
            site.sell(item, quantity)
            driver.deliver(item, quantity, customer)
        }
    }
}