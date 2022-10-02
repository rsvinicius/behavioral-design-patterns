package interpreter

//Client
fun main() {
    var context = "_Int"
    val interpreter = FirstLetterNotUnderscore()
    context = interpreter.interpret(context)
    println(context)
}