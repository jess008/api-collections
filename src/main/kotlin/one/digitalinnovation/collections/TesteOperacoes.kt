package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("--------------------")
    println("Maior Salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Tamanho: ${salarios.size}")
    println("Media salario: ${salarios.average()}")

    println("--------------------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------------------")
    salariosMaiorQue2500.forEach{println(it)}


}