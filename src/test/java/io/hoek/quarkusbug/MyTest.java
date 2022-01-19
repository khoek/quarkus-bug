package io.hoek.quarkusbug;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class MyTest {

    @Test
    public void testSomething() {
        given().when().get("/test/hello")
                .then().statusCode(200);
    }

    @Produces
    @Path("test")
    public static class TestResource {

        @GET
        @Path("hello")
        public Response getHello() {
            return Response.ok().build();
        }
    }
}