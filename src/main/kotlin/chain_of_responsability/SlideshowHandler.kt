package chain_of_responsability

class SlideshowHandler : DocumentHandler() {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "ppt")
            println("Opening slideshow document...")
        else
            openNext(fileExtension)
    }
}