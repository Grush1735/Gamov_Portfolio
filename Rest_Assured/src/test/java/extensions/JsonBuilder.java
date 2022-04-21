package extensions;

public class JsonBuilder {

    private String json = "{\r\n";
    private String email = "\"email\":\"TestEmail@gmail.com\",\r\n";
    private String name = "\"name\": \"Johnny Batonny\",\r\n";
    private String gender = "\"gender\": \"male\",\r\n";
    private String status = "\"status\": \"active\"\r\n";

    public JsonBuilder addEmail(){
        this.json += email;
        return this;
    }

    public JsonBuilder addRandomEmail(){
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(8);
        for(int i = 0; i < 8; i++){
            int index = (int)(AB.length() * Math.random());
            sb.append(AB.charAt(index));
        }
        this.json += "\"email\": \"" + sb.toString() + "@gmail.com\",\r\n";
        return this;
    }

    public JsonBuilder addEmail(String email){
        this.json += "\"email\": \"" + email + "@gmail.com\",\r\n";
        return this;
    }

    public JsonBuilder addName(){
        this.json += name;
        return this;
    }

    public JsonBuilder addName(String name){
        this.json += "\"name\": \"" + name + "\",\r\n";
        return this;
    }

    public JsonBuilder addGender(){
        this.json += gender;
        return this;
    }

    public JsonBuilder addGender(String gender){
        this.json += "\"gender\": \"" + gender + "\",\r\n";
        return this;
    }

    public JsonBuilder addStatus(){
        this.json += status;
        return this;
    }

    public JsonBuilder addStatus(String status){
        this.json += "\"status\": \"" + status + "\"\r\n";
        return this;
    }

    public JsonBuilder addID(int id){
        this.json += "\"id\": " + id + "\r\n";
        return this;
    }

    public String get(){
        return json + "}";
    }
}
