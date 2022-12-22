package by.it_academy.web_page_testing.api;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@Test
public class TestingAPI{
    String url = "https://api.clickup.com/";
    String token = "pk_61302155_5PCHAXZUR9DI0DHKOPT57NOY10Y7YK9S";

    public void testRequestGetAuthorizedUser(){
        String endPoint = "api/v2/user";
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .get(url + endPoint)
                .then()
                .statusCode(200)
                .log().body()
                .body("user.id", is(61302155));
    }

    public void testRequestGetAuthorizedTeam(){
        String endPoint = "api/v2/team";
        given().
                contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .get(url + endPoint)
                .then()
                .statusCode(200)
                .log().body()
                .body("teams[0].name", is("Viktor Marchuk's Workspace"))
                .body("teams[0].members[0].user.email", is("viktor.marchuk0207@gmail.com"));
    }

    public void testRequestGetTaskTemplates(){
        String endPoint = "api/v2/team/43292335/taskTemplate?page=1";
        int team_id = 43292335;
        int page = 1;
        String requestBody = String.format("{\"team_id\":\"%s\",\"page\":\"%s\"}", team_id, page);
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .and()
                .body(requestBody)
                .when()
                .get(url + endPoint)
                .then()
                .statusCode(200)
                .log().body();
    }

    public void testRequestGetSpaces(){
        String endPoint = "api/v2/team/43292335/space?archived=false";
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .get(url + endPoint)
                .then()
                .statusCode(200)
                .log().body()
                .body("spaces[0].statuses[0].id", is("p90030005243_dC7djGpS"))
                .body("spaces[0].features.zoom.enabled", is(false));
    }

    public void testRequestDeleteSpace(){
        String endPoint = "api/v2/space/67234496";
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .delete(url + endPoint)
                .then()
                .statusCode(200)
                .log().body();
    }

    public void testRequestCreateFolder(){
        String enPoint = "api/v2/space/67234496/folder";
        String name = "WTO";
        String requestBody = String.format("{\"name\":\"%s\"}", name);
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .and()
                .body(requestBody)
                .when()
                .post("https://api.clickup.com/api/v2/space/67234496/folder")
                .then()
                .statusCode(200)
                .log().body();
    }
}
