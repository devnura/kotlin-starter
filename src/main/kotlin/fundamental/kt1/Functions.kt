package fundamental.kt1

fun main() {
    val user = setUser("Devnura", 23)
    println(user)

    printUser("Devnura")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Devnura, and you 23 years old
Your name is Devnura
*/