import java.util.HashSet;
import java.util.Iterator;


class Main {
    public static void main (String[] args) {

        HashSet<String> states = new HashSet<String>();
        states.add("NY");
        states.add("Idaho");
        states.add("Texas");
        states.add("Vermont");
        System.out.println(states);

        // Access HT elements w/ iter.
        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(", ");
        }
    }
}
