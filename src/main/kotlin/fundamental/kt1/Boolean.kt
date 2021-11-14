package fundamental.kt1

fun main() {
    conjunction()
    disjunction()
    negation()
}
fun conjunction(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 10

    /*
        val isOpen = if (now >= officeOpen && now <= officeClosed){
            true
        } else {
            false
        }
    */

     val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")

    /*
        Output : Office is open : false
     */
}

fun disjunction(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")
    /*
        Output : Office is closed : true
     */
}

fun negation() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

    /*
        Output : Office is open
     */
}