package com.restapiexample.dummy.dummyrestapi;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DummyDeleteTest extends TestBase {
    @Test
    public void deleteSigleUserInfo() {
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 21)
                .when()
                .delete("/delete/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}