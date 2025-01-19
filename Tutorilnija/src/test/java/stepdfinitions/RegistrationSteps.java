package stepdfinitions;

import io.cucumber.java.en.*;
import pages.RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegistrationSteps {
    WebDriver driver;
    RegistrationPage registrationPage;

    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
      
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registrationPage = new RegistrationPage(driver);
    }

    @When("the user fills in valid registration details")
    public void the_user_fills_in_valid_registration_details() {
        registrationPage.enterFirstName("masai");
        registrationPage.enterLastName("masaischool");
        registrationPage.enterEmail("masaischool@gmail.com");
        registrationPage.enterTelephone("1234567890");
        registrationPage.enterPassword("Password123");
        registrationPage.enterConfirmPassword("Password123");
        registrationPage.acceptTermsAndConditions();
    }

    @And("the user submits the registration form")
    public void the_user_submits_the_registration_form() {
        registrationPage.clickContinue();
    }
    
    
}
