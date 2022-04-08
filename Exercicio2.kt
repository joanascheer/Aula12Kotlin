fun main() {
    println("Quantos anos você tem? ")
    val idade = readln().toInt()

    calculaDias(idade)
}

fun calculaDias (idade:Int) {
    val diasVividos = idade * 365
    println("Você já viveu $diasVividos")
}

/*Crie um algoritmo que leia uma idade de uma pessoa e calcule
quantos dias essa pessoa já viveu*/