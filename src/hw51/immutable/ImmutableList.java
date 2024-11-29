package hw51.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImmutableList {
    private final String name;
    private final List<Integer> numbers;
    private final MyMutableClass mmc;

    public ImmutableList(String name, List<Integer> numbers, MyMutableClass mmc) {
        this.name = name;
        this.numbers = numbers;
        this.mmc = mmc;
    }

    public String getName() {

        return name;
    }

    public List<Integer> getNumbers() {

        return new ArrayList<>(numbers);
    }

    public MyMutableClass getMmc() {
        return new MyMutableClass(mmc);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImmutableList il = (ImmutableList) obj;
        return Objects.equals(name, il.name) && Objects.equals(numbers, il.numbers) && Objects.equals(mmc, il.mmc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, mmc);
    }

    @Override
    public String toString() {
        return "ImmutableList{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                ", mmc=" + mmc +
                '}' + '\n';
    }
}
