package collections.hashset;

import java.util.*;

public class UniqueCourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("New Registrations: ");
        String[] newRegistrations = scanner.nextLine().split(" ");
        List<String> newRegistrationsList = new ArrayList<>(Arrays.asList(newRegistrations));

        System.out.print("Already Registered: ");
        String[] alreadyRegistered = scanner.nextLine().split(" ");
        Set<String> alreadyRegisteredSet = new HashSet<>(Arrays.asList(alreadyRegistered));

        Set<String> cannotRegisterSet = new HashSet<>();
        for (String registration: newRegistrationsList) {
            if (alreadyRegisteredSet.contains(registration)) {
                cannotRegisterSet.add(registration);
            }
        }
        System.out.print("Cannot Register: ");
        System.out.println(cannotRegisterSet);
    }
}
