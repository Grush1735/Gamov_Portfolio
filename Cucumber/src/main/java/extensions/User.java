package extensions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public final String correctLogin = "tomsmith";
    public final String correctPassword = "SuperSecretPassword!";
    public final String incorrectPassword = "NotSuperSecretPassword!";

    private String login;
    private String password;

}
