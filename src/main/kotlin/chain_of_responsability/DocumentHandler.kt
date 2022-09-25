package chain_of_responsability

abstract class DocumentHandler {
    private var next: DocumentHandler? = null

    abstract fun openDocument(fileExtension: String)

    protected open fun openNext(fileExtension: String) {
        return if (next == null) {
            throw Exception("File extension not supported")
        } else next!!.openDocument(fileExtension)
    }

    companion object {
        fun link(first: DocumentHandler, vararg chain: DocumentHandler): DocumentHandler {
            var head: DocumentHandler = first
            for (nextInChain in chain) {
                head.next = nextInChain
                head = nextInChain
            }
            return first
        }
    }
}