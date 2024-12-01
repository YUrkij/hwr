package hw49.Comparators;

import java.util.Comparator;

public class SpyCountryComparator implements Comparator<Spy> {
    @Override
    public int compare(Spy spy1, Spy spy2) {
        int countryCompare;

        if (spy1.country == null && spy2.country == null) {
            countryCompare = 0;
        } else if (spy1.country == null) {
            return -1;
        } else if (spy2.country == null) {
            return 1;
        } else {
            countryCompare = spy1.country.compareTo(spy2.country);
            if (countryCompare != 0) {
                return countryCompare;
            }
        }
        int nameCompare = spy1.realName.compareTo(spy2.realName);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return spy1.nationality.compareTo(spy2.nationality);

    }
}

