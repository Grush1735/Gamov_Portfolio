import extensions.JsonBuilder;
import extensions.JsonParser;
import extensions.UserData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

public class PrimalSetup {

    final String Base_URL = "https://gorest.co.in";
    final String CreateUser_URI = Base_URL + "/public/v2/users";
    final String GetUsers_ULI = Base_URL + "/public/v2/users";
    final String GetUserBy_URI = Base_URL + "/public/v2/users/{userId}";

    protected static UserData user = new UserData();
    public JsonBuilder builder = new JsonBuilder();
    public JsonParser parser = new JsonParser();

    RequestSpecification auth(){
        RequestSpecification auth = RestAssured.given();
        return auth.header("Authorization", bearer(user.getToken()))
                .header("Accept", ContentType.JSON)
                .header("Content-Type", ContentType.JSON);
    }

    RequestSpecification contentType(){
        RequestSpecification content = RestAssured.given();
        return content.header("Accept", ContentType.JSON)
                .header("Content-Type", ContentType.JSON);
    }

    private String bearer(String token){
        return "Bearer " + token;
    }

    Cookie authCookie = new Cookie.Builder("Authorization", bearer(user.getToken())).build();

    @BeforeEach
    void setup(){
        RestAssured.baseURI = Base_URL;
    }
}
