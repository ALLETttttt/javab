package exceptions;

public class ParameterValidation {

    public void validateNumber(int age) throws ParameterValidationException {
        if (age < 0) {
            throw new ParameterValidationException("Age can not be negative.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        ParameterValidation parameterValidationException = new ParameterValidation();

        try {
            parameterValidationException.validateNumber(-4);
        } catch (ParameterValidationException e) {
            System.err.print("Error: " + e.getMessage());
        }
    }
}
