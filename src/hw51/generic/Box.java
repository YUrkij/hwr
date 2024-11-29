package hw51.generic;

public class Box<E> {
    private E value;

    public Box(E value) {
        this.value = value;
    }

    public Box() {
        this.value = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Проверяет value на null
     *
     * @return true если value == null
     */
    public boolean isEmpty() {
        return value == null;
    }

    /**
     * Очищает value
     */
    public void clear() {
        this.value = null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
