package org.odrabiamy.steps;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredSteps{
    public static void main(String[] args) {
        // Ustawienie adresu URL dla wszystkich zapytań
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Stworzenie nowego użytkownika
        RequestSpecification createRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"user1\",\"firstName\":\"First\",\"lastName\":\"Last\",\"email\":\"email@example.com\",\"password\":\"password\",\"phone\":\"123-456-7890\",\"userStatus\":0}");
        Response createResponse = createRequest.post("/user");
        System.out.println("Stworzenie użytkownika: " + createResponse.getStatusCode());

        // Logowanie użytkownika
        RequestSpecification loginRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .queryParam("username", "user1")
                .queryParam("password", "password");
        Response loginResponse = loginRequest.get("/user/login");
        System.out.println("Logowanie użytkownika: " + loginResponse.getStatusCode());
        String apiKey = "special-key";

        // Aktualizacja użytkownika
        RequestSpecification updateRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("api_key", apiKey)
                .body("{\"firstName\":\"UpdatedFirst\"}");
        Response updateResponse = updateRequest.put("/user/user1");
        System.out.println("Aktualizacja użytkownika: " + updateResponse.getStatusCode());
    }
}
