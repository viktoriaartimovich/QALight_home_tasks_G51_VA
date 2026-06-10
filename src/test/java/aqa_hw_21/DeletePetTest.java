package aqa_hw_21;

import aqa_hw_21.dto.CategoryDto;
import aqa_hw_21.dto.NotFoundPetDto;
import aqa_hw_21.dto.PetDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeletePetTest {

    @Test
    public void verifyPetCanBeDeleted(){

        int petIdToCreate = 102;
        CategoryDto categoryDto = new CategoryDto(13, "Pudel");
        String petName = "Tuzik";
        String status = "available";

        PetDto petToCreate = new PetDto(petIdToCreate, categoryDto, petName, status);

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petToCreate).post("https://petstore.swagger.io/v2/pet");

        PetDto createdPetDto = createdPetResponse.as(PetDto.class);
        Assert.assertEquals(createdPetDto.getId(), petIdToCreate);

        Response previoutslyCretedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        PetDto previoutslyCretedPetDto = previoutslyCretedPetResponse.as(PetDto.class);

        System.out.println(previoutslyCretedPetResponse.asPrettyString());
        Assert.assertEquals(previoutslyCretedPetDto.getId(), petIdToCreate);

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        NotFoundPetDto notFoundPetDto = deletedPetResponse.as(NotFoundPetDto.class);

        Assert.assertEquals(deletedPetResponse.getStatusCode(), 404);
        Assert.assertEquals(notFoundPetDto.getType(), "error");
        Assert.assertEquals(notFoundPetDto.getMessage(),"Pet not found");

    }
}
