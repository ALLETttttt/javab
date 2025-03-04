package encapsulation.task7;

public class UserProfile {
    private String username;
    private String email;
    private String password;

    public UserProfile(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void updateEmail(String email) {
        if (!email.isEmpty()) {
            if (email.endsWith("@example.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email format.");
            }
        } else {
            System.out.println("Email is empty.");
        }
    }

    public void updatePassword(String password) {
        if (!password.isEmpty()) {
            if (password.length() >= 8 && password.length() <= 16) {
                this.password = password;
            } else {
                System.out.println("Password length range should be in range 8 and 16./");
            }
        } else {
            System.out.println("Password is empty.");
        }
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
