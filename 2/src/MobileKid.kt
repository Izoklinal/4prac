/**
 * Класс MobileKid
 * @property name - Название оператора
 * @property oneMinutePrice - цена за одну минуту
 * @property square - площадь покрытия
 * @property P - наличие платы за каждое соединение
 *
 * @author Савицин Денис
 */

class MobileKid(_name: String, _oneMinutePrice: Double, _square: Int, _P:Boolean): Mobile(_name, _oneMinutePrice, _square) {
    private var P: Boolean
    init {
        P=_P
    }

    /**
     * Расчет качества объекта
     * @return - качество объекта рассчитано по формуле 0.7 * качество объекта если P - истина, если  нет то 1.5 * качество объекта
     *
     * @author Савицин Денис
     */
    fun QualityP():Double{
        if (P){
            return 0.7*Quality()
        }
        else{
            return 1.5*Quality()
        }
    }

    override fun Info(): String {
        return super.Info() + "\nP - $P\nQualityP - ${QualityP()}"
    }
}