package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val carla = Funcionario("Carla", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, carla)

    funcionarios.forEach{println(it)}
    println("-------------------")

    println(funcionarios.find{it.nome=="Maria"})

    println("-------------------")
    funcionarios.sortedBy{it.salario}
    funcionarios.forEach{println(it)}

    println("-------------------")
    funcionarios.groupBy{it.tipoContratacao}
        .forEach{println(it)}

}
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        "Nome: $nome \n" +
        "Salario: $salario" + "".trimIndent()

}

