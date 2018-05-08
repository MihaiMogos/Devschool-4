package ro.ing.tech.devschool.testing.e2e;

import io.restassured.http.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import ro.ing.tech.devschool.testing.api.model.Account;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountResourceE2E {

    @Test(timeout = 10000)
    public void shouldReturn200WhenAccountFound() {
        get("http://localhost:8081/account/1").then().statusCode(HttpStatus.OK.value());
    }

    @Test(timeout = 10000)
    public void shouldReturn400WhenAccountNotFound() {
        get("http://localhost:8081/account/10").then().statusCode(HttpStatus.BAD_REQUEST.value());
    }

    @Test(timeout = 10000)
    public void shouldAddAccount() {
        String clientName = "Marius";

        Account account = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(clientName)
                .when().post("http://localhost:8081/account/add")
                .then().statusCode(HttpStatus.OK.value()).extract().response().getBody().as(Account.class);

        assertEquals(clientName, account.getClientName());

        removeAccount(account.getAccountNumber());
    }

    private void removeAccount(long profileId) {
        delete("http://localhost:8081/account/" + profileId);
    }

}
