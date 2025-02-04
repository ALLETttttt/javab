package collections.hashset;

import java.util.*;

public class OptimalRouteIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Blocked Routes: ");
        String[] blockerRoutes = scanner.nextLine().split(" ");

        System.out.print("Available Routes: ");
        String[] availableRoutes = scanner.nextLine().split(" ");

        List<String> availableRoutesList = new ArrayList<>(Arrays.asList(availableRoutes));
        Set<String> blockerRoutesSet = new HashSet<>(Arrays.asList(blockerRoutes));
        Set<String> filteredSet = new HashSet<>();

        for (String route: availableRoutesList) {
            if (!blockerRoutesSet.contains(route)) {
                filteredSet.add(route);
            }
        }
        System.out.println(filteredSet);

    }
}
