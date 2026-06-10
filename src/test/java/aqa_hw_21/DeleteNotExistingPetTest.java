package aqa_hw_21;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteNotExistingPetTest {

    @Test
    public void verifyNotExistingPetCannotBeDeleted() {

        int notExistingPetId = 999999999;

        Response response = given().delete("https://petstore.swagger.io/v2/pet/" + notExistingPetId);

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
