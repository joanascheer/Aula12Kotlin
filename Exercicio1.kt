fun main() {
    println("Digite um número")
    val numero = readln().toInt()

    antessessor(numero)
}

fun antessessor(numero:Int) {
    val antecessor = numero - 1
    println("O antecessor de $numero é $antecessor")
}

/*
* Crie um algoritmo que leia um número inteiro e mostre seu
antecessor
* */