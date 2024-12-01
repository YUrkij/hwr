package hw49.Comparators;

public class Spy {
    String country;
    final String nationality;
    final String realName;

    public Spy(String nationality, String realName, String countryAbr) {
        this.nationality = nationality;
        this.realName = realName;
        this.country = countryAbr;
    }

    public void setCountryAbr(String countryAbr) {
        this.country = countryAbr;
    }

    public void removeCountry() {
        this.country = null;
    }

    @Override
    public String toString() {
        return "Spy{" +
                "countryAbr='" + country + '\'' +
                ", nationality='" + nationality + '\'' +
                ", realName='" + realName + '\'' +
                '}' + '\n';
    }
}
