fun main(){

    var baseMaior: Double
    var baseMenor: Double
    var h: Double

    println("Insira o valor da base maior: "); baseMaior = readln().toDouble()
    println("Insira o valor da base menor: "); baseMenor = readln().toDouble()
    println("Insira o valor da altura: "); h = readln().toDouble()

    var conta = ((baseMaior + baseMenor) * h) / 2

    println("A area do trapezio é: $conta")

}