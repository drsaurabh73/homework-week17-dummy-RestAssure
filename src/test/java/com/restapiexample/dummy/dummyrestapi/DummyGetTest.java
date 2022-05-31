package com.restapiexample.dummy.dummyrestapi;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DummyGetTest extends TestBase {
    @Test
    public void getDummyemployeeinfo() {

        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getDummySigleId() {
        Response response = given()
                .when()
                .get("/employee/1");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
