package extensions;

import lombok.Data;
@Data
public class User {

    private final String correctUsername = "tomsmith";
    private final String correctPassword = "SuperSecretPassword!";
    private final String incorrectPassword = "NotSuperSecretPassword!";
}
