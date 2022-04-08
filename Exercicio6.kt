import java.math.BigDecimal

fun main() {
    println("Qual o valor em dólar que deseja converter? ")
    val valorEmDolar = readln().toDouble()

    converteEmReal(valorEmDolar)
}

fun converteEmReal (valorEmDolar: Double) {
    val valorEmReal = valorEmDolar * 4.7
    println("U$$ $valorEmDolar = R$ $valorEmReal")
}

/*
* Crie um algoritmo que lê um valor real em dólar, e converte o valor
para reais. Considere a cotação do dolar atual (4,70)
* */