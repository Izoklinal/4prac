/**
 * Класс компьютер
 * @property processorName - название процессора
 * @property frequency - частота процессора
 * @property RAM - объем оперативной памяти
 * @property P - объем винчестера
 *
 * @author Савицин Денис
 * Вариант 1
 */

class ComputerKid(_processorName: String, _frequency: Int, _RAM: Int, _P: Int): Computer(_processorName, _frequency, _RAM) {
    private var P: Int
    init {
        P=_P
    }

    /**
     * Расчет качество объекта
     * @return - качество объекта рассчитано по формуле Качество объекта + 0.5 * объем винчестера
     *
     * @author Савицин Денис
     */
    fun QualityP():Double{
        return Quality()+0.5*P
    }

    override fun printInfo(): String {
        return super.printInfo() + "\nWinchester - $P\nQualityKid - ${QualityP()}"
    }
}