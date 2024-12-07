package hw55.passwords;

public class PasswordChecker {
    static final int MIN_PASSWORD_LENGTH = 8;
    static final int MAX_PASSWORD_LENGTH = 20;

    /**
     * Проверка паролья по следующим условиям:
     * Пароль не пуст
     * Пароль находится в границах 8 < password.length() < 20
     * Пороль имеет хотя бы один символ верхнего и нижнего регистра
     * Пороль имеет хотя бы одиу цифру
     * Пароль не имеет пробелов
     *
     * @param password - пароль
     * @return Password is walid
     */
    public static String check(String password) throws InvalidPasswordException {
        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordException("Password is empty");
        }

        if (password.length() < MIN_PASSWORD_LENGTH || password.length() > MAX_PASSWORD_LENGTH) {
            throw new InvalidPasswordException("Password is out of bounds : " + MIN_PASSWORD_LENGTH + " to " + MAX_PASSWORD_LENGTH);
        }


        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSpase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                isUpper = true;
            }
            if (Character.isLowerCase(ch)) {
                isLower = true;
            }
            if (Character.isDigit(ch)) {
                isDigit = true;
            }
            if (ch == ' ') {
                isSpase = true;
            }
        }

        if (!isUpper) {
            throw new InvalidPasswordException("Password must contains characters in upper case");
        }

        if (!isLower) {
            throw new InvalidPasswordException("Password must contains characters in lower case");
        }

        if (!isDigit) {
            throw new InvalidPasswordException("Password must contains digits");
        }

        if (isSpase) {
            throw new InvalidPasswordException("Password can't contains spaces");
        }

        return "Password is walid";
    }
}
