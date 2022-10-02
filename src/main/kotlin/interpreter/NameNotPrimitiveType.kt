package interpreter

//Terminal Expression
class NameNotPrimitiveType : Expression {
    override fun interpret(context: String): String {
        var validContext = context
        if(context == "int" || context == "boolean" || context == "double") {
            validContext = context + "1"
        }
        return validContext
    }
}