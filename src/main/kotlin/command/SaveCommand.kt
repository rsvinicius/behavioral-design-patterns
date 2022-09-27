package command

class SaveCommand(private val document: Document) : Command {
    override fun execute() {
        document.save()
    }
}