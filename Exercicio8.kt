fun main() {
    println("Qual o valor de x?")
    var x = readln().toInt()

    println("Qual o valor de y?")
    var y = readln().toInt()

    trocaValores(x, y)
}

fun trocaValores (x: Int, y: Int) {
    var x = x + y
    var y = x - y
    x = x - y

    println("x = $x e y = $y")
}

/*
* Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor
destas variáveis. Isto é, x deve ficar com o valor de y e y deve ficar
com o valor de x. Mostre os valores depois da troca
* */