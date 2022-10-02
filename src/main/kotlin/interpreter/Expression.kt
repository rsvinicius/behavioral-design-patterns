package interpreter

//Abstract Expression
interface Expression {
    fun interpret(context: String): String
}