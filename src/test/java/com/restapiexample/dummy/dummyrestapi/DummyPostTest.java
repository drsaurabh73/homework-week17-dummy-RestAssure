package com.restapiexample.dummy.dummyrestapi;

import com.restapiexample.dummy.model.DummyPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DummyPostTest extends TestBase {

    @Test
    public void setCreateNewUser() {
        DummyPojo dummyPojo = new DummyPojo();
        dummyPojo.setName("test");
        dummyPojo.setSalary("123");
        dummyPojo.setId(25);
        dummyPojo.setAge(23);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(dummyPojo)
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void setPutNewUser() {
        DummyPojo dummyPojo = new DummyPojo();
        dummyPojo.setEmployeename("dhyani");
        dummyPojo.setSalary("50000");
        dummyPojo.setProfielimage("");
        dummyPojo.setAge(30);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(dummyPojo)
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}