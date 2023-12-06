import kotlin.random.Random
//  14 вариант легкий
fun main() {
    println("4.1")
    var sum = 0

    val Numbsers = List(17) { Random.nextInt(0, 11) }.toMutableList()
    println(Numbsers)

    for (i in 0..8) {
        if (i % 2 == 0) sum += Numbsers[i]

    }

    for (i in 0..9) {
        if (Numbsers[i] % 3 == 0) {
            Numbsers[i] = sum
        }
    }
    println(Numbsers)
//  14 вариант легкий
    println("4.2")
    var indMin = ""

    val biMas = mutableListOf<MutableList<Int>>()
    for (j in 0..3) {
        biMas.add(MutableList(4) { Random.nextInt(0, 10) })
    }
    for (j in 0..3){
        println(biMas[j])
    }
    var min = biMas[0][0]
    for (j in 0..3) {
        for (i in 0..3){
            if(biMas[j][i] < min ) {
                indMin = "$j;$i"
                min = biMas[j][i]
            }
        }
    }
    println("$min по кординатам " + indMin)
}