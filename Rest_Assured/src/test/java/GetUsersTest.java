import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.notNullValue;

public class GetUsersTest extends PrimalSetup {

    @Test
    public void getAllUsers(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .when()
                    .get(GetUsers_ULI)
                .then().log().all(), true);
        assertThat(parser.getNames(), everyItem(notNullValue()));
    }

    @Test
    public void getUserById_query(){
        RestAssured
                .given(auth()).log().all()
                .queryParam("id","4860")
                .when()
                .get(GetUsers_ULI)
                .then().log().all()
                .body("$", Matchers.everyItem(Matchers.hasEntry("name", "Johnny Batonny")));
    }

    @Test
    public void getUserById_path(){
        RestAssured
                .given(auth()).log().all()
                .pathParam("userId","4860")
                .when()
                .get(GetUserBy_URI)
                .then().log().all()
                .body("$", Matchers.hasEntry("name", "Johnny Batonny"));
    }

    @Test
    public void getUserByName(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .queryParam("name","Johnny Batonny")
                .when()
                    .get(GetUsers_ULI)
                .then().log().all(), true);
        assertThat(parser.getNames(), everyItem(Matchers.equalTo("Johnny Batonny")));
    }

    @Test
    public void getUserByEmail(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .queryParam("email","JjRjqU3v@gmail.com")
                .when()
                .get(GetUsers_ULI)
                .then().log().all(), true);
        assertThat(parser.getNames(), everyItem(Matchers.equalTo("Johnny Batonny")));
        assertThat(parser.getEmails(), everyItem(Matchers.equalTo("JjRjqU3v@gmail.com")));
    }

    @Test
    public void getUserByGender(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .queryParam("gender","male")
                .when()
                .get(GetUsers_ULI)
                .then().log().all(), true);
        assertThat(parser.getNames(), everyItem(Matchers.notNullValue()));
        assertThat(parser.getGenders(), everyItem(Matchers.equalTo("male")));
    }

    @Test
    public void getUserByStatus(){
        parser.setResponse(RestAssured
                .given(auth()).log().all()
                .queryParam("status","active")
                .when()
                .get(GetUsers_ULI)
                .then().log().all(), true);
        assertThat(parser.getNames(), everyItem(Matchers.notNullValue()));
        assertThat(parser.getStatuses(), everyItem(Matchers.equalTo("active")));
    }
}
