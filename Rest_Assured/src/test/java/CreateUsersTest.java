import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CreateUsersTest extends PrimalSetup {


    @Test
    public void createUserWithoutToken(){
        RestAssured
                .given().log().all()
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(401)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("message", Matchers.containsString("Authentication failed"));
    }

    @Test
    public void createUser_NoFields(){
        RestAssured
                .given(auth()).log().all()
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(4));
    }

    @Test
    public void createUser_NoFields_query(){
        RestAssured
                .given().log().all()
                .queryParam("access-token", user.getToken())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(4));
    }

    @Test
    public void createUser_NoEmail(){
        RestAssured
                .given(auth()).log().all()
                .body(builder.addName().addGender().addStatus().get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("field", "email")))
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(1));
    }

    @Test
    public void createUser_NoName(){
        RestAssured
                .given(auth()).log().all()
                .body(builder.addEmail().addGender().addStatus().get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("field", "name")))
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(1));
    }

    @Test
    public void createUser_NoGender(){
        RestAssured
                .given(auth()).log().all()
                .body(builder.addEmail().addName().addStatus().get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("field", "gender")))
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(1));
    }

    @Test
    public void createUser_NoStatus(){
        RestAssured
                .given(auth()).log().all()
                .body(builder.addGender().addName().addEmail("\"email\": \"TestEmail@gmail.com\"\r\n").get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(422)
                .body("$", Matchers.everyItem(Matchers.hasEntry("field", "status")))
                .body("$", Matchers.everyItem(Matchers.hasEntry("message", "can't be blank")))
                .body("$.size()", Matchers.equalTo(1));
    }

    @Test
    public void createUser(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .body(builder.addRandomEmail().addGender().addName().addStatus().get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(201)
                .body("id", Matchers.notNullValue())
                .body("size()", Matchers.equalTo(5)));
    }

    @Test
    public void createUser_withAssert(){
        //Create user
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .body(builder.addRandomEmail().addGender().addName().addStatus().get())
                .when()
                .post(CreateUser_URI)
                .then().log().all()
                .statusCode(201)
                .body("id", Matchers.notNullValue())
                .body("size()", Matchers.equalTo(5)));
        //Check created user
        RestAssured
                .given(auth()).log().all()
                .pathParam("userId", parser.getUserId())
                .when()
                .get(GetUserBy_URI)
                .then().log().all()
                .body("size()", Matchers.equalTo(5))
                .body("id", Matchers.equalTo(parser.getUserId()));
    }
}
