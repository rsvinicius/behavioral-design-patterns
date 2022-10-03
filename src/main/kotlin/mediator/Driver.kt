package mediator

class Driver {
    fun deliver(item: String, quantity: Int, customer: Customer) {
        println("$quantity $item out for delivery to ${customer.address}")
    }
}
