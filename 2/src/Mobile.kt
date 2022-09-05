/**
 * Класс Мобильный оператор
 * @property name - Название оператора
 * @property oneMinutePrice - цена за одну минуту
 * @property square - площадь покрытия
 *
 * @author Савицин Денис
 * 2 вариант
 */

open class Mobile(_name: String, _oneMinutePrice: Double, _square: Int) {
    private var name: String
    private var oneMinutePrice: Double
    private var square: Int
    init {
        name=_name
        oneMinutePrice=_oneMinutePrice
        square=_square
    }

    /**
     * Расчет качества объекта
     * @return - качество объекта рассчитано по формуле 100 * площадь покрытия / цена за одну минуту
     */
    open fun Quality():Double{
        return 100*square/oneMinutePrice
    }
    open fun Info():String{
        return "Name - $name\nOne minute price - $oneMinutePrice\nSquare - $square\nQuality - ${Quality()}"
    }
}