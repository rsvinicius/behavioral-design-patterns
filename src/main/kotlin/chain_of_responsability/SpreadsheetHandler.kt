package chain_of_responsability

class SpreadsheetHandler : DocumentHandler() {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "xlsx")
            println("Opening spreadsheet document...")
        else
            openNext(fileExtension)
    }
}