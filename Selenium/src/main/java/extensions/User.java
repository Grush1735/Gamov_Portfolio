package extensions;

public class User {

    private final String correctUsername = "tomsmith";
    private final String correctPassword = "SuperSecretPassword!";
    private final String incorrectPassword = "NotSuperSecretPassword!";

    public String getCorrectUsername() {
        return correctUsername;
    }

    public String getCorrectPassword() {
        return correctPassword;
    }

    public String getIncorrectPassword() {
        return incorrectPassword;
    }
}
