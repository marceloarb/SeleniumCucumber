package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {

    @Given("User is on loading homepage")
    public void user_is_on_loading_homepage() {
        System.out.println("Hello");
    }

    @When("Homepage is loaded")
    public void homepage_is_loaded() {
        System.out.println("Hellou");
    }

    @Then("All products all displayed")
    public void all_products_all_displayed() {
        System.out.println("Hellouo");
    }
}
