package collections.treemap;

import java.util.TreeMap;

public class LibraryBookTracker {
    public static void main(String[] args) {
        TreeMap<String, String> library = new TreeMap<>();
        library.put("Alice", "Moby Dick");
        library.put("Bob", "War and Peace");

        String returnedFrom = "Alice";
        library.remove(returnedFrom);

        System.out.println(library);
    }
}
