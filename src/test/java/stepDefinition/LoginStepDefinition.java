package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver;
    @Given("user is in login page")
    public void user_is_in_login_page() {
        driver = new ChromeDriver();
        driver.get("https://icehrmpro.gamonoid.com/login.php");

    }
    @When("user gives valid credentials")
    public void user_gives_valid_credentials() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
    }
    @And("clicks login button")
    public void clicks_login_button() {
        driver.findElement(By.xpath("//button[text()='Log in ']")).click();
    }
    @Then("user should be logged in and navigated to home page")
    public void user_should_be_logged_in_and_navigated_to_home_page() {
        WebElement homebtn = driver.findElement(By.xpath("//a[@class='logo']"));
        boolean status = homebtn.isDisplayed();
        Assert.assertTrue(status);
        System.out.println("Login successful");
        driver.quit();
    }
}
