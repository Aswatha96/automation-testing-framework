package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ProductAPI extends BaseAPI {

    public Response getProducts(){

        return given()
                .when()
                .get("/products");
    }

}