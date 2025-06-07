package JAVA_REPO6;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> testIds = new HashSet<>();
        testIds.add("TC001");
        testIds.add("TC002");
        testIds.add("TC001"); // Duplicate, won't be added

        testIds.add("TC003");
        testIds.add("TC004");
        System.out.println("Unique test IDs: " + testIds);
    }
}
