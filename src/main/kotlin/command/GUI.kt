package command

fun main() {
    val document = Document()

    val saveButton = Button()
    val printButton = Button()

    saveButton.click(SaveCommand(document))
    printButton.click(PrintCommand(document))
}