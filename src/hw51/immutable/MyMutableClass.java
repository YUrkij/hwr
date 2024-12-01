package hw51.immutable;

import java.util.Objects;

public class MyMutableClass {
    public int value;

    public MyMutableClass(int value) {
        this.value = value;
    }

    public MyMutableClass(MyMutableClass obj) {
        this.value = obj.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyMutableClass mmc = (MyMutableClass) obj;
        return value == mmc.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "MyMutableClass{" +
                "value=" + value +
                '}';
    }
}
