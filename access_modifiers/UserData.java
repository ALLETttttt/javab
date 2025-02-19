package access_modifiers;

public class UserData {
    private final String password;

    public UserData(String password) {
        this.password = password;
    }

    public boolean isPasswordCorrect(String str) {
        return this.password.equals(str);
    }
}
