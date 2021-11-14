package fundamental.kt1

fun main(){

    /*
        Safe Call
     */
    val text1: String? = null
    println("Safe call output : ${text1?.length}")

    /*
        Elvis Operator
     */
    val text2: String? = null
    val textLength = text2?.length ?: 7
    println("Elvis Operator output : ${textLength}")

}