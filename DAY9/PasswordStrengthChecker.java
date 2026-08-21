public class PasswordStrengthChecker {

    static String checkStrength(String password) {

        if (password.length() < 6) {
            return "Weak";
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (hasUppercase && hasDigit && hasSpecial) {
            return "Strong";
        }

        if (hasUppercase && hasDigit) {
            return "Medium";
        }

        return "Weak";
    }

    public static void main(String[] args) {

        String password = "Java@123";

        System.out.println("Password: " + password);
        System.out.println("Strength: " + checkStrength(password));
    }
}