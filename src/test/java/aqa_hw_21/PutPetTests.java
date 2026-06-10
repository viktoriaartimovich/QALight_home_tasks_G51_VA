package aqa_hw_21;

import aqa_hw_21.dto.CategoryDto;
import aqa_hw_21.dto.PetDto;
import aqa_hw_21.dto.TagDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified() {

        int petIdToCreate = 103;
        int categoryId = 13;
        String categoryName = "Pudel";
        String petName = "Tuzik";
        String status = "available";

        CategoryDto categoryDto = new CategoryDto(categoryId, categoryName);

        List<String> photoUrls = List.of(
                "url1",
                "url2",
                "url3"
        );

        List<TagDto> tags = List.of(new TagDto(32, "some name"));

        PetDto petToCreate = new PetDto(
                petIdToCreate,
                categoryDto,
                petName,
                photoUrls,
                tags,
                status
        );

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petToCreate)
                .post("https://petstore.swagger.io/v2/pet");

        PetDto createdPetDto = createdPetResponse.as(PetDto.class);

        Assert.assertEquals(createdPetResponse.getStatusCode(), 200);
        Assert.assertEquals(createdPetDto.getId(), petIdToCreate);

        Response getCreatedPetResponse = given()
                .get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        PetDto getCreatedPetDto = getCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(getCreatedPetResponse.getStatusCode(), 200);
        Assert.assertEquals(getCreatedPetDto.getId(), petIdToCreate);
        Assert.assertEquals(getCreatedPetDto.getName(), petName);
        Assert.assertEquals(getCreatedPetDto.getStatus(), status);
        Assert.assertEquals(getCreatedPetDto.getCategory().getName(), categoryName);

        String updatedPetName = "Barsik";
        String updatedStatus = "sold";
        String updatedCategoryName = "Bulldog";

        getCreatedPetDto.setName(updatedPetName);
        getCreatedPetDto.setStatus(updatedStatus);
        getCreatedPetDto.getCategory().setName(updatedCategoryName);

        Response updatedPetResponse = given()
                .contentType("application/json")
                .body(getCreatedPetDto)
                .put("https://petstore.swagger.io/v2/pet");

        PetDto updatedPetDto = updatedPetResponse.as(PetDto.class);

        Assert.assertEquals(updatedPetResponse.getStatusCode(), 200);
        Assert.assertEquals(updatedPetDto.getId(), petIdToCreate);
        Assert.assertEquals(updatedPetDto.getName(), updatedPetName);
        Assert.assertEquals(updatedPetDto.getStatus(), updatedStatus);
        Assert.assertEquals(updatedPetDto.getCategory().getName(), updatedCategoryName);

        Response getUpdatedPetResponse = given()
                .get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        PetDto getUpdatedPetDto = getUpdatedPetResponse.as(PetDto.class);

        Assert.assertEquals(getUpdatedPetResponse.getStatusCode(), 200);
        Assert.assertEquals(getUpdatedPetDto.getId(), petIdToCreate);
        Assert.assertEquals(getUpdatedPetDto.getName(), updatedPetName);
        Assert.assertEquals(getUpdatedPetDto.getStatus(), updatedStatus);
        Assert.assertEquals(getUpdatedPetDto.getCategory().getName(), updatedCategoryName);
    }
}