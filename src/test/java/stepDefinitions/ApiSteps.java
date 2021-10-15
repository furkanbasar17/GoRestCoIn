package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiSteps {
    @Given("user enters {string}")
    public void userEnters(String arg0) {
    }

    @Given("set api enpoint")
    public void setApiEnpoint() {
    }

    @And("User creates new user with request body {string},{string},{string},")
    public void userCreatesNewUserWithRequestBody(String name, String gender, String email) {
    }

    @Then("validate the status code {int}")
    public void validateTheStatusCode(int arg0) {
    }

    @And("validate the userId is not null")
    public void validateTheUserIdIsNotNull() {
    }

    @And("validate the user name is  {string}")
    public void validateTheUserNameIs(String arg0) {
    }

    @And("validate the user Gender is {string}")
    public void validateTheUserGenderIs(String arg0) {
    }

    @And("validate the user Email is  {string}")
    public void validateTheUserEmailIs(String arg0) {
    }

    @And("validate the user status is {string}")
    public void validateTheUserStatusIs(String arg0) {
    }
}
