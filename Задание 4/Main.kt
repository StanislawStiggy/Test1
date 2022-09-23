fun main() {
    var carni = Carnivore()
    var herbi = Herbivore()
    println("Привет! Выбери:")
    while (true){
        println("1 - Хищные, 2 - Травоядные, 3 - Весь список")
        var a = readLine()!!.toInt()
        when (a) {
            1 -> {
                for (i in carni.hish) {
                    println(i)
                }
            }
            2 -> {
                for (v in herbi.trav){
                    println(v)
                }
            }
            3 -> {
                for (x in  carni.hish){
                    println(x)
                }
                for (n in herbi.trav){
                    println(n)
                }

            }
            else -> {
                println("Ошибка")
            }
        }
    }

}
