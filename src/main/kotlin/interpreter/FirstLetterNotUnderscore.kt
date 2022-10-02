package interpreter

//Non-Terminal Expression
class FirstLetterNotUnderscore : Expression {
    private var firstLetterIsLowerCase = FirstLetterIsLowerCase()

    override fun interpret(context: String): String {
        var validContext = context
        if (context.startsWith("_")){
            validContext = context.substring(1)
        }
        return firstLetterIsLowerCase.interpret(validContext)
    }
}