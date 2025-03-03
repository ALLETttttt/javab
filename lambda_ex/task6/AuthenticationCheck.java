package lambda_ex.task6;


public class AuthenticationCheck {
    public static void main(String[] args) {
        AuthenticationChecker authenticationChecker = (username, password) ->
                !username.isEmpty() && !password.isEmpty();

        checkData(authenticationChecker, "", "");
        checkData(authenticationChecker, "param", "tadam");
        checkData(authenticationChecker, "wvwevew", "scwev");
    }

    public static void checkData(AuthenticationChecker authenticationChecker,
                                 String login, String password) {
        String result = authenticationChecker.isValid(login, password) ? "Success": "Fail";
        System.out.println("Authentication: " + result);
    }
}
