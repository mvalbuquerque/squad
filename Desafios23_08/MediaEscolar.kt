fun main(){
    val nota1: Double = 5.5;
    val nota2: Double = 10.3;
    val nota3: Double = 4.9;

// 
    var media: Double = (nota1+nota2+nota3)/3;
    // val mediaFormatada = String.format("%.2f", media);


    println(String.format("A média de %.2f, %.2f e %.2f é: %.2f", nota1, nota2, nota3, media));
}