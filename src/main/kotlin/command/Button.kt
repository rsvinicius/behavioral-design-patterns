package command

// Invoker
class Button {
    fun click(command: Command) {
        command.execute()
    }
}