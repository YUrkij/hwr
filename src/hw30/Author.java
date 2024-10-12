package hw30;

public class Author {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return Возвращает имя и фамилию в строке
     */
    public String getAuthorInfo(){
        return getName() + " " + getSurname();
    }
}
