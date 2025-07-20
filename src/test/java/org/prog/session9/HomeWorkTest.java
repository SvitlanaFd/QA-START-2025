package org.prog.session9;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

//TODO: add check for location.street.number
//TODO: add check for location.street.name
//TODO: add check for location.coordinates.latitude
//TODO: add check for location.coordinates.longitude

public class HomeWorkTest {
    @Test
    public void streetValidationTest() {
        RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,nat,location")
                .queryParam("results", 3)
                .queryParam("noinfo")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results.location.street.number", Matchers.hasItem(Matchers.greaterThan(2)))
                .body("results.location.street.name", Matchers.hasItem(Matchers.containsStringIgnoringCase("s")));
    }

    @Test
    public void coordinatesValidationTest() {
        RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,nat,location")
                .queryParam("results", 3)
                .queryParam("noinfo")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results.location.coordinates.latitude", Matchers.hasItem(Matchers.containsString(".")))
                .body("results.location.coordinates.longitude", Matchers.hasItem(Matchers.containsString("-")));
    }
}
