package interpreter

//Non-Terminal Expression
class FirstLetterIsLowerCase : Expression {
    private var nameNotPrimitiveType = NameNotPrimitiveType()

    override fun interpret(context: String): String {
        val validContext = context.substring(0, 1).lowercase() + context.substring(1)
        return nameNotPrimitiveType.interpret(validContext)
    }
}