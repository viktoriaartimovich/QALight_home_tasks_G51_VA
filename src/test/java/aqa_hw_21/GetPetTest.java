package aqa_hw_21;

import aqa_hw_21.dto.PetDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPetTest {

    @Test
    public void verifyPetEntityCanBeObtained(){

        int petIdToGet = 101;

        Response response = given().get("https://petstore.swagger.io/v2/pet/" + petIdToGet);

        PetDto obtainPet = response.as(PetDto.class);

        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(obtainPet.getId(), petIdToGet);


    }
}
