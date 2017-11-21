package se.webstep.kotlinworkshop.part_2_functions

val strangeSentence = "I have never thought I'm gonna need to give blood again. You saw me up there, right?"

fun split(s: String) = s.split(" ").toList()
fun getEveryThirdWord(arr: List<String>) = arr
        .zip(1..arr.size)
        .filter { (it.second) % 3 == 0 }
        .map { it.first }
        .joinToString(" ")
        .toLowerCase()

fun main(args: Array<String>) {
    val sp = split(strangeSentence)
    println("sp: " + sp)
    val res = getEveryThirdWord(sp)
    println("res: " + res)
}