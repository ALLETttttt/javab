package encapsulation.task7;

public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Alex", "alex@example.com", "password88");
        userProfile.updateEmail("new_alex@example.com");
        userProfile.updatePassword("123123121");
        System.out.println(userProfile);

        userProfile.updateEmail("new_alex@exampwele.com");
        userProfile.updatePassword("dwedwedwdwedwedwdwedwdewdw");
        System.out.println(userProfile);
    }
}
