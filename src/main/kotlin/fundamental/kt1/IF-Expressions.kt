package fundamental.kt1
fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)

    /*
        Output : Wait a minute, office will be open
    */
}

