fun main(){
    println("Базовый класс")
    val computerKiller = Computer("Killer", 100, 12)
    println(computerKiller.printInfo())
    println("Класс наследник")
    val computerPeace = ComputerKid("Peace", 150, 12, 13)
    println(computerPeace.printInfo())
}