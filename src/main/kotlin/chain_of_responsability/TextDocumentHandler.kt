package chain_of_responsability

class TextDocumentHandler : DocumentHandler() {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "txt")
            println("Opening text document...")
        else
            openNext(fileExtension)
    }
}