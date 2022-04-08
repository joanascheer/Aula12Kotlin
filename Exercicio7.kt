fun main() {
    println("Digite o tamanho da base do seu retângulo")
    val base = readln().toDouble()

    println("Digite o tamanho da altura do seu retângulo")
    val altura = readln().toDouble()

    calculaArea(base, altura)
}

fun calculaArea (base: Double, altura: Double) {
    val area = base * altura
    println("A área do seu retângulo é de $area m")
}

/*
* Escreva um algoritmo para ler as dimensões de um retângulo (base
e altura), calcular e escrever a área do retângulo
* */