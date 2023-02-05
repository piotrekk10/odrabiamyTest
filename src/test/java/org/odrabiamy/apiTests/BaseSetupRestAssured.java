package org.odrabiamy.apiTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;


public abstract class  BaseSetupRestAssured {

    @BeforeEach
    public void setup(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
