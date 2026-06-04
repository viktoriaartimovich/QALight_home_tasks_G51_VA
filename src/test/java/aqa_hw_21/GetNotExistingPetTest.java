package aqa_hw_21;

import aqa_hw_21.dto.NotFoundPetDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetNotExistingPetTest {
    @Test
    public void verifyNotExistingPetCannotBeReturned() {

        int notExistingPetId = 999999999;

        Response response = given().get("https://petstore.swagger.io/v2/pet/" + notExistingPetId);

        NotFoundPetDto notFoundPetDto =
                response.as(NotFoundPetDto.class);

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 404);
        Assert.assertEquals(notFoundPetDto.getType(), "error");
        Assert.assertEquals(notFoundPetDto.getMessage(), "Pet not found");
    }

}
