package hw49;

abstract class Counter {

    /**
     * Изменение строки
     *
     * @param curString - новая строка
     */
    public abstract void setCurString(String curString);

    protected abstract void fillHashMap();

    /**
     * Определяет есть ли уникальные символы
     */
    public abstract boolean hasUniqueSymbol();

    /**
     * Среднее колличество символов
     */
    public abstract double mediumSum();
}
