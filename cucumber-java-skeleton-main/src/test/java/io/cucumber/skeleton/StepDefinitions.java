package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class StepDefinitions {

    private Belly belly;

    @Given("I have a growling belly")
    public void I_have_a_growling_belly() {
        belly = new Belly(true);
    }

    @When("I eat {int} cookies")
    public void I_eat_cookies(int amountOfCookies) {
        belly.eat(amountOfCookies);
    }

    @Then("my belly should no longer growl")
    public void belly_should_not_growl() {
        Assertions.assertThat(belly.isGrowling()).isFalse();
    }
}
