package lambda_ex.task6;

@FunctionalInterface
interface AuthenticationChecker {
    boolean isValid(String login, String password);
}
