package com.demoblaze.stepsDefinitions;

import com.demoblaze.steps.HomepageSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinitions {
    @Steps
    HomepageSteps homepageSteps;

    @Given("^The user is on the website$")
    public void theUserIsOnTheWebsite() {
        homepageSteps.openBrowser();
    }

    @When("^User enter username and password$")
    public void userEnterUsernameAndPassword() throws IOException {
        homepageSteps.insertUsername();
        homepageSteps.insertPassword();
    }

    @Then("^The user will see a successful login message$")
    public void theUserWillSeeASuccessfulLoginMessage() {
        homepageSteps.validation();
    }
}
