fun main() {
    println("Qual é a temperatura em graus Célsius? ")
    val temperatura = readln().toDouble()

    verifica(temperatura)
}

fun verifica (temperatura: Double) {
    if (temperatura <= 18) {
        println("Está frio, hein!")
    } else if (temperatura > 18 && temperatura <= 23) {
        println("O clima está agradável! Sai do computador e vai passear!")
    } else if (temperatura > 23 && temperatura <= 35) {
        println("Está quente, mas você mora em São Paulo, então é melhor levar blusa mesmo assim.")
    } else if (temperatura > 35) {
        println("Está absurdamente quente, vamos tomar um sorvete?")
    }
}

/*
* Crie um algoritmo que, dada uma temperatura em graus célsius,
exiba uma mensagem informando o tipo do clima, de acordo com as
seguintes condições:
a. se a temperatura estiver até 18 graus, o clima é frio;
b. se a temperatura estiver entre 19 e 23 graus, o clima é
agradável;
c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
d. se a temperatura estiver acima de 35 graus, o clima é muito
quente
* */