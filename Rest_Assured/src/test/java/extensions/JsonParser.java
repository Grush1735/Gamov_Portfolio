package extensions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.List;

public class JsonParser {
    protected Response response;
    private int userId;
    private String name;
    private List<String> names;
    private List<String> emails;
    private List<String> genders;
    private List<String> statuses;


    public void setResponse(ValidatableResponse response) {
        this.response = extractResponse(response);
        this.userId = extractResponse(response).jsonPath().get("id");
        this.name = extractResponse(response).jsonPath().get("name");
    }

    public void setResponse(ValidatableResponse response, boolean array) {
        this.response = extractResponse(response);
        this.names = extractResponse(response).jsonPath().getList("name");
        this.emails = extractResponse(response).jsonPath().getList("email");
        this.genders = extractResponse(response).jsonPath().getList("gender");
        this.statuses = extractResponse(response).jsonPath().getList("status");
    }

    private Response extractResponse(ValidatableResponse response){
        return response.extract().response();
    }

    public int getUserId(){
        return userId;
    }

    public List<String> getNames() {
        return names;
    }

    public String getName(){
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public List<String> getGenders() {
        return genders;
    }

    public List<String> getStatuses() {
        return statuses;
    }
}
