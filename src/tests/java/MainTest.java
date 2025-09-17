import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
public class MainTest {


    @Test
    public void Andpoint() {
    given()
            .baseUri("https://postman-echo.com")
        .when()
                .get("/cookies")
                .then()
                .assertThat()
                .statusCode(200);
    }


    @Test
    public void get() {
        RestAssured.baseURI = "https://postman-echo.com";
        //RestAssured.baseURI = "D:\АСТОН ДЗ\ДЗ к лекции 2.8\\Postman Echo.postman_collection.json";
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1", equalTo("bar1"));
    }

    @Test
    public void post() {
        RestAssured.baseURI = "https://postman-echo.com";
        //RestAssured.baseURI = "D:\АСТОН ДЗ\ДЗ к лекции 2.8\\Postman Echo.postman_collection.json";

        String requestBody = "{\"bar3\", \"foo3\"}";
        Object id = given()
                .contentType(ContentType.JSON) // Указываем тип контента - JSON
                .body(requestBody) // Передаем тело запроса
                .when()
                .post("/post")
                .then()
                .statusCode(201); // Проверяем код статуса (например, 201 Created)
}
    @Test
    public void delete() {
        RestAssured.baseURI = "https://postman-echo.com";
        //RestAssured.baseURI = "D:\АСТОН ДЗ\ДЗ к лекции 2.8\\Postman Echo.postman_collection.json";

        given()
                .when()
                .delete("/Key/foo3")
                .then()
                .assertThat()
                .statusCode(200); //  код статуса
    }

    @Test
    public void put() {
        RestAssured.baseURI = "https://postman-echo.com";
        //RestAssured.baseURI = "D:\АСТОН ДЗ\ДЗ к лекции 2.8\\Postman Echo.postman_collection.json";

        // Данные для foo2
        String updatedUserData = "{\"Key\": \"foo2\", \"Value\": \"Newbar2\"}";

        // PUT-запрос и  ответ
        given()
                .contentType("application/json")
                .body(updatedUserData)
                .when()
                .put(updatedUserData) // Отправка PUT-запроса
                .then()
                .statusCode(200) // 200 OK
                .body("Key", equalTo("Value")); // Проверка, что обновлено
    }
    }




