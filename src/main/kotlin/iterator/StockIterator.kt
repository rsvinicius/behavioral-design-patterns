package iterator

class StockIterator(private val inventory: Inventory) : Iterator<Item?> {
    private var index: Int = 0

    override fun hasNext(): Boolean {
        val items = inventory.items

        if (index < items.size) {
            return true
        }

        return false
    }

    override fun next(): Item? {
        val items = inventory.items

        if (hasNext()) {
            val item = items[index++]

            return if (isItemQuantityGreaterThanZero(item)) {
                item
            } else {
                next()
            }
        }

        return null
    }

    private fun isItemQuantityGreaterThanZero(item: Item) = item.quantity > 0
}