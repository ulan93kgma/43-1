import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(Comparator.reverseOrder());
        treeMap.put(2007, "Свинья");
        treeMap.put(2008, "Крыса");
        treeMap.put(2009, "Бык");
        treeMap.put(2010, "Тигр");
        treeMap.put(2011, "Кролик");
        System.out.println(treeMap);
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        System.out.println(treeMap.tailMap(2009));
        System.out.println(treeMap.lastEntry());
    }
}
