package apitests;

import api.ProductAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductAPITest {

    @Test
    public void getProductList(){

        ProductAPI api = new ProductAPI();

        Response response = api.getProducts();

        System.out.println(response.getBody().asPrettyString());

        Assert.assertEquals(response.statusCode(),200);
    }
}
