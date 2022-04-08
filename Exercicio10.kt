fun main() {
    println("Digite um número: ")
    val numeroDigitado = readln().toInt()

    calculaSucessor(numeroDigitado)
}

fun calculaSucessor (numeroDigitado: Int) {
    val sucessor = numeroDigitado + 1
    println("O sucessor de $numeroDigitado é $sucessor")
}

/*
* Crie um algoritmo que leia um número inteiro e mostre seu sucessor
* */