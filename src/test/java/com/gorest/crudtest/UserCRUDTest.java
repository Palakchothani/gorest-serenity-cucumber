package com.gorest.crudtest;

import com.gorest.steps.UsersSteps;
import com.gorest.testbase.TestBase;
import com.gorest.utils.PropertyReader;
import com.gorest.utils.TestUtils;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class UserCRUDTest extends TestBase {
    static String token = PropertyReader.getInstance().getProperty("token");
    static String name = "Prime" + TestUtils.getRandomValue();
    static String gender = "male";
    static String email = name + "@email.com";
    static String status = "active";
    static int userID;
    @Steps
    UsersSteps usersSteps;

    @Title("Create a new User")
    @Test
    public void test001() {
      //  ValidatableResponse response = usersSteps.createUser(name, gender, email, status, token);
        //response.log().all().statusCode(201);
        //userID = response.log().all().extract().path("id");
        System.out.println(userID);
    }
}
