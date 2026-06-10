package aqa_hw_21;

import aqa_hw_21.dto.CategoryDto;
import aqa_hw_21.dto.PetDto;
import aqa_hw_21.dto.TagDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CreatePetTest {

    @Test
    public void verifyPetCanBeCreated(){
        int petIdToCreate = 101;
        int categoryId = 13;
        String categoryName = "Pudel";
        String petName = "Tuzik";
        CategoryDto categoryDto = new CategoryDto(categoryId, categoryName);

        List<String> photoUrls = List.of(
                "url1",
                "url2",
                "url3"
        );
        List<TagDto> tags = List.of(new TagDto(32 ,"some name"));
        String status = "available";

        PetDto petToCreate = new PetDto(petIdToCreate, categoryDto, petName, photoUrls, tags, status);

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petToCreate).post("https://petstore.swagger.io/v2/pet");

        PetDto createdPetDto = createdPetResponse.as(PetDto.class);
        Assert.assertEquals(createdPetDto.getId(), petIdToCreate);

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(previouslyCreatedPetDto.getId(), petIdToCreate);
        Assert.assertEquals(previouslyCreatedPetDto.getCategory().getId(), categoryId);
        Assert.assertEquals(previouslyCreatedPetDto.getCategory().getName(), categoryName);
        Assert.assertEquals(previouslyCreatedPetDto.getName(), petName);
        Assert.assertEquals(previouslyCreatedPetDto.getStatus(), status);
    }
}
