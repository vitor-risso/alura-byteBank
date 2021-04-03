package br.com.example.myproject

fun main() {
    println("STARTING... \n")

    val sawAndroidCourse: MutableSet<String> = mutableSetOf("vitor", "ana")
    val sawKotlinCourse: MutableSet<String> = mutableSetOf("vitor", "paulo")
//    val sawBoth = sawAndroidCourse + sawKotlinCourse
//    set retorna uma lista distinta diferentemente sesomarmos duas listas normais
//    sawBoth.addAll(sawAndroidCourse)
//    sawBoth.addAll(sawKotlinCourse)
//    println(sawBoth.distinct()) -> using list
    val sawBoth: MutableSet<String> = mutableSetOf()
    sawBoth.addAll(sawAndroidCourse)
    sawBoth.addAll(sawKotlinCourse)
    println(sawBoth)
    println(sawAndroidCourse intersect  sawKotlinCourse)
//    println(sawAndroidCourse union sawKotlinCourse)
//    println(sawAndroidCourse subtract  sawKotlinCourse)
//    mesma coisa que usar + e -


}

