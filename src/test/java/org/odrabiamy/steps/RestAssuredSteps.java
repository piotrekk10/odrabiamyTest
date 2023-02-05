package org.odrabiamy.steps;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.odrabiamy.model.User;
import org.odrabiamy.utils.ObjectConverter;

public class RestAssuredSteps {

    private ValidatableResponse response;
    User user;

    public void createUser(User user) {
        this.user = user;
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(ObjectConverter.convertToJson(user))
                .when()
                .post("/user")
                .then()
                .statusCode(200);
    }

    public void logUserIntoSystem() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .params("username", user.getUsername(), "password", user.getPassword())
                .when()
                .get("/user/login")
                .then()
                .statusCode(200);
    }

    public void updateUser() {
        user.setPassowrd("newPassword");
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(ObjectConverter.convertToJson(user))
                .when()
                .put("/user/" + user.getUsername())
                .then()
                .statusCode(200);
    }
}
