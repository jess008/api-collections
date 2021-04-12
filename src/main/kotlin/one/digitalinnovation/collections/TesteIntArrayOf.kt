package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(2, 3, 6, 8, 1)

    values.forEach{
        println(it)
    }
    println("----------------")
    values.sort()
    values.forEach{
        println(it)
        }



}