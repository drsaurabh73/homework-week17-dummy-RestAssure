package com.restapiexample.dummy.dummyrestapi;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class DummyDataResponseTest extends TestBase {

    @Test //total records are 24
    public void Test001() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        List<Integer> totalrecord = response.then().extract().path("data");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Total records are : " + totalrecord.size());
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  //data[23].id = 24
    public void Test002() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        int idnumber = response.then().extract().path("data[23].id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data 23 ID is : " + idnumber);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  // data[23].employee_name = “Doris Wilder”
    public void Test003() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        String employeename = response.then().extract().path("data[23].employee_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data 23 ID is : " + employeename);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  // message = “Successfully! All records has been  fetched.”
    public void Test004() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        String messagelist = response.then().extract().path("message");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The message is displayed : " + messagelist);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  // status = success
    public void Test005() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        String statusmessage = response.then().extract().path("status");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The message is displayed : " + statusmessage);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  //id = 3 has employee_salary = 86000
    public void Test006() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        int employeesalary = response.then().extract().path("data[2].employee_salary");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The employee salary is displayed : " + employeesalary);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test  // id = 6 has employee_age = 61
    public void Test007() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        int employeeage = response.then().extract().path("data[5].employee_age");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The employee age is displayed : " + employeeage);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test  // id = 11 has employee_name = Jena Gaines
    public void Test008() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        int employeename = response.then().extract().path("data[5].employee_age");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The employee name is displayed : " + employeename);
        System.out.println("------------------End of Test---------------------------");
    }
}