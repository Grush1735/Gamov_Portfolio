import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.notNullValue;

public class GetUsersTest extends PrimalSetup {

    @Test
    public void getAllUsers(){
        parser.setResponse(RestAssured
                .given(contentType()).log().all()
                .when()
                    .get(GetUsers_ULI)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json")), true);
        assertThat(parser.getNames(), everyItem(notNullValue()));
    }

    @Test
    public void getUserById_query(){
        RestAssured
                .given(contentType()).log().all()
                .queryParam("id","4860")
                .when()
                .get(GetUsers_ULI)
                .then().log().all()
                .body("$", Matchers.everyItem(Matchers.hasEntry("name", "Johnny Batonny")))
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json"));
    }

    @Test
    public void getUserById_path(){
        RestAssured
                .given(contentType()).log().all()
                .pathParam("userId","4860")
                .when()
                .get(GetUserBy_URI)
                .then().log().all()
                .body("$", Matchers.hasEntry("name", "Johnny Batonny"))
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_user_object.json"));
    }

    @Test
    public void getUserByName(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .queryParam("name","Johnny Batonny")
                .when()
                    .get(GetUsers_ULI)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json")), true);
        assertThat(parser.getNames(), everyItem(Matchers.equalTo("Johnny Batonny")));
    }

    @Test
    public void getUserByEmail(){
        parser.setResponse(RestAssured
                .given(contentType()).log().all()
                .queryParam("email","JjRjqU3v@gmail.com")
                .when()
                .get(GetUsers_ULI)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json")), true);
        assertThat(parser.getNames(), everyItem(Matchers.equalTo("Johnny Batonny")));
        assertThat(parser.getEmails(), everyItem(Matchers.equalTo("JjRjqU3v@gmail.com")));
    }

    @Test
    public void getUserByGender(){
        parser.setResponse(RestAssured
                .given(contentType()).log().all()
                .queryParam("gender","male")
                .when()
                .get(GetUsers_ULI)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json")), true);
        assertThat(parser.getNames(), everyItem(Matchers.notNullValue()));
        assertThat(parser.getGenders(), everyItem(Matchers.equalTo("male")));
    }

    @Test
    public void getUserByStatus(){
        parser.setResponse(RestAssured
                .given(contentType()).log().all()
                .queryParam("status","active")
                .when()
                .get(GetUsers_ULI)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/get_users_array.json")), true);
        assertThat(parser.getNames(), everyItem(Matchers.notNullValue()));
        assertThat(parser.getStatuses(), everyItem(Matchers.equalTo("active")));
    }
}
