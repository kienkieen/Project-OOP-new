import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Tao tap hop 2 so nguyen voi Set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Them phan tu cua tap hop thu 1 va 2
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Tinh giao cua 2 tap hop
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Tinh hoi cua 2 tap hop
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Tinh hieu cua 2 tap hop
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // Sap xep ket qua bang cach su dung tree set
        TreeSet<Integer> sortedResult = new TreeSet<>(intersection);
        System.out.println("Giao: " + sortedResult);

        sortedResult = new TreeSet<>(union);
        System.out.println("Hội: " + sortedResult);

        sortedResult = new TreeSet<>(difference);
        System.out.println("Hiệu: " + sortedResult);

    }
}