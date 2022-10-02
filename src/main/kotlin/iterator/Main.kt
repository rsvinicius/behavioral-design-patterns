package iterator

fun main() {
    val pens = Item("pens", 175)
    val pencils = Item("pencils", 0)
    val paper = Item("paper", 500)

    val inventory = Inventory(arrayOf(pens, pencils, paper))
    val stockIterator = inventory.iterator()

    while (stockIterator.hasNext()) {
        val item = stockIterator.next()
        println(item?.name)
    }
}