fun main(){

    var diagonalMaior: Double
    var diagonalMenor: Double

    println("Insira o valor da diagonal maior: "); diagonalMaior = readln().toDouble()
    println("Insira o valor da diagonal menor"); diagonalMenor = readln().toDouble()

    var conta = (diagonalMaior*diagonalMenor) / 2

    println("A area do Losango é: $conta")

}