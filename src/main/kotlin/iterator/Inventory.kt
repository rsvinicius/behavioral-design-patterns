package iterator

class Inventory(val items: Array<Item>) : Iterable<Item?> {
    override fun iterator(): Iterator<Item?> = StockIterator(this)
}