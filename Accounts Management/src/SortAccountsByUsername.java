import java.util.Comparator;

public class SortAccountsByUsername implements Comparator<Accounts> {
    @Override
    public int compare(Accounts o1, Accounts o2) {
        return o1.getUsername().compareTo(o2.getUsername());
    }
}