package chain_of_responsability

class DocumentClient {
    fun handle(fileExtension: String) {
        documentHandlerChain().openDocument(fileExtension)
    }

    private fun documentHandlerChain(): DocumentHandler {
        return DocumentHandler.link(
            SlideshowHandler(),
            SpreadsheetHandler(),
            TextDocumentHandler()
        )
    }
}