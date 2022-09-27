package command

class PrintCommand(private val document: Document) : Command {
    override fun execute() {
        document.print()
    }
}