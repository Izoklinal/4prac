/**
 * Класс компьютер
 * @property processorName - название процессора
 * @property frequency - частота процессора
 * @property RAM - объем оперативной памяти
 *
 * @author Савицин Денис
 * Вариант 1
 */

open class Computer (_processorName: String, _frequency: Int, _RAM: Int) {
    private var processorName: String
    private var frequency: Int
    private var RAM: Int
    init {
        processorName=_processorName
        frequency=_frequency
        RAM=_RAM
    }

    /**
     * Рассчет качество объекта
     * @return - качество объекта рассчитано по формуле 0.1 * частота процессора + объем оперативной памяти
     *
     * @author Савицин Денис
     */
    open fun Quality():Double{
        return (0.1*frequency)+RAM
    }
    open fun printInfo():String{
        return "Processor name - $processorName\nFrequency - $frequency\nRAM - $RAM\nQuality - ${Quality()}"
    }
}