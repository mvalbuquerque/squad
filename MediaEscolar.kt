fun main() {
    var nota1: Double = 8.5;
    var nota2: Double = 5.9;
    var nota3: Double = 6.7;    
    var media: Double = (nota1 + nota2 + nota3) / 3;
    var saida: String = String.format("A média de %.2f, %.2f e %.2f e %.2f", nota1, nota2, nota3, media);

    println(saida);
}
