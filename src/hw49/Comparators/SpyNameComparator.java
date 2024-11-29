package hw49.Comparators;

import java.util.Comparator;

public class SpyNameComparator implements Comparator<Spy> {
    @Override
    public int compare(Spy spy1, Spy spy2) {
        int nameCompare = spy1.realName.compareTo(spy2.realName);
        if (nameCompare != 0) {
            return nameCompare;
        }
        int nationalityCompare = spy1.nationality.compareTo(spy2.nationality);
        if (nationalityCompare != 0) {
            return nationalityCompare;
        }
        if (spy1.country == null && spy2.country == null) {
            return 0;
        }
        if (spy1.country == null) {
            return -1;
        }
        if (spy2.country == null) {
            return 1;
        }
        return spy1.country.compareTo(spy2.country);
    }
}
