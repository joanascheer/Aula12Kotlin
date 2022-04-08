fun main() {
    println("Digite um número")
    val numeroDigitado = readln().toInt()

    verificaNumero(numeroDigitado)
}

fun verificaNumero (numeroDigitado: Int) {
    if (numeroDigitado < 0) {
        println("Este número é negativo")
    } else {
        println("Este número NÃO é negativo.")
    }
}

/*
* Crie um algoritmo que leia um número do usuário e informe se e o
número é positivo ou negativo
* */