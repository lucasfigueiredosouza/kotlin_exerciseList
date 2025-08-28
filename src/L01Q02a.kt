

fun main(){
    /*
    *L01Q02a - Write a program with read two notes,
    *calculate average and show results
    * */

    println("Informe a primeira nota :")
    val nota1 = readln().toInt()

    println("Informe a segunda nota :")
    val nota2 = readln().toInt()

    val media = (nota1+nota2)/2

    println(media)
}

