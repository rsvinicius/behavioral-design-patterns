package memento

fun main() {
    val textDocument = TextDocument()

    textDocument.write("hello")
    textDocument.save()
    textDocument.print()
    textDocument.write(" world")
    textDocument.print()
    textDocument.undo()
    textDocument.print()
}