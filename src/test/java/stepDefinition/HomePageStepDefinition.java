package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStepDefinition {
    WebDriver driver;
    @Given("User passes the valid url.")
    public void user_passes_the_valid_url() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/?zx=1759510253603&no_sw_cr=1");
    }
    @When("user clicks enter button.")
    public void user_clicks_enter_button() {
    }
    @Then("loading for the url.")
    public void loading_for_the_url() {

    }
}
