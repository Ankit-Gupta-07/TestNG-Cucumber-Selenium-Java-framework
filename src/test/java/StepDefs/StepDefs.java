package StepDefs;

import Utility.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static POM.login.*;

public class StepDefs extends BaseClass {
    @Given("user navigates to given URL")
    public void userNavigatesToGivenURL() {
        hitUrl();
    }

    @And("user verifies the title")
    public void userVerifiesTheTitle() throws InterruptedException {
        titleFetch();
    }
    @Given("user clicks on signIn or logIn button")
    public void userClicksOnSignIn(){
        signIn();
    }
    @Then("user provides {string} and {string}")
    public void userEntersCredentials(String username, String password){
        enterCredentials(username,password);
    }

}
