package example.myapp

//step 1
const val rocks = 3
//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2


//step 2
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}
fun main(){

}