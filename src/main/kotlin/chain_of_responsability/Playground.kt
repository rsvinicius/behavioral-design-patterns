package chain_of_responsability

fun main() {
    val client = DocumentClient()

    client.handle("ppt")
    client.handle("txt")
    client.handle("xlsx")
    client.handle("pdf") //not supported, should throw exception
}