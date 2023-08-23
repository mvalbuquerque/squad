fun main(){
    // Definir a temperatura em graus Celsius
    val celsius: Double = 25.0;
    // Convertendo a temperatura Celsius para Fahrenheit
    val fahrenheit: Double = celsius * (9/5) + 32;
    // Convertendo a temperatura Celsius para Kelvin
    val kelvin: Double = celsius + 273.15;

    // Imprime a temperatura Celsius
    println("Temperatura em Celsius: $celsius ºC");
    // Imprimindo a temperatura em Fahrenheit
    println("Temperatura em Fahrenheit: $fahrenheit ºF");
    // Imprimindo a temperatura em Kelvin
    println("Temperatura em Kelvin: $kelvin K");
}