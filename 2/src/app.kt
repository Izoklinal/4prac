fun main(){
    println("Базовый класс")
    val mobile = Mobile("Samsung", 5.0, 10)
    println(mobile.Info())
    println("Наследник класс")
    val mobile2 = MobileKid("Motiv", 6.0, 11, true)
    println(mobile2.Info())
}