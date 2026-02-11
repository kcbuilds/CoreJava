package Internship;

public class UserValidator {

    public static String validateUser(String email, Integer age) {

        // 1. Null check
        if (email == null) {
            return "Email is required";
        }

        // 2. Normalize once
        String normalizedEmail = email.trim();

        // 3. Empty check
        if (normalizedEmail.isEmpty()) {
            return "Email must not be empty";
        }

        // 4. Minimal format check (safe & generic)
        if (!normalizedEmail.contains("@")) {
            return "Invalid email format";
        }

        // 5. Age validation
        if (age == null) {
            return "Age is required";
        }

        if (age < 18) {
            return "User must be at least 18 years old";
        }

        return "USER_VALID";
    }



public static void main(String[] args) {
        String karan = validateUser("kc@gmail.com", 25);
        System.out.println(karan);
    }
}
