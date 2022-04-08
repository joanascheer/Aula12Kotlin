fun main() {
    println("Digite um número")
    val numeroDigitado = readln().toInt()

    verifica(numeroDigitado)
}

fun verifica (numeroDigitado: Int) {
    if (numeroDigitado % 5 == 0) {
        println("Este número é múltiplo de 5")
    } else {
        println("Este número NÃO é múltiplo de 5")
    }
}

/*
* Crie um algoritmo que receba do usuário um número qualquer e
verifique se esse é múltiplo de 5
* */