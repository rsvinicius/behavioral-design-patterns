package memento

class TextDocument {
    private var text: String = ""
    private val memento: Memento = Memento(text)

    fun write(appendText: String) {
        this.text += appendText
    }

    fun print() {
        println(text)
    }

    fun save() {
        memento.state = text
    }

    fun undo() {
        text = memento.state
    }
}