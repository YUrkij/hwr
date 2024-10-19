package hw34.animals;

public class Animal {

    protected String name;

    public Animal() {
        this.name = null;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        return "";
    }

    public void eat(){}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
