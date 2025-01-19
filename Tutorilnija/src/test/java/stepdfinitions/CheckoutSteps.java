package stepdfinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.CheckoutPage;

public class CheckoutSteps {
    WebDriver driver;
    CheckoutPage checkoutPage;

    @Given("the user is on the product page")
    public void the_user_is_on_the_product_page() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        checkoutPage = new CheckoutPage(driver);
    }

    @When("the user adds {string} to the cart")
    public void the_user_adds_to_the_cart(String productName) {
        checkoutPage.searchForProduct(productName);
        checkoutPage.selectProduct();
        checkoutPage.addToCart();
    }

    @And("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        checkoutPage.goToShoppingCart();
        checkoutPage.proceedToCheckout();
    }

    @Then("the user should see the order summary with the correct product details")
    public void the_user_should_see_the_order_summary_with_the_correct_product_details() {
        // Verify that the product appears in the order summary (example)
        String totalPrice = checkoutPage.getTotalPrice();
        Assert.assertNotNull(totalPrice, "Order summary is missing product details.");
        driver.quit();
    }

    @Given("the user has added items to the cart")
    public void the_user_has_added_items_to_the_cart() {
        the_user_is_on_the_product_page();
        the_user_adds_to_the_cart("MacBook");
    }

    @When("the user applies the promo code {string}")
    public void the_user_applies_the_promo_code(String promoCode) {
        checkoutPage.goToShoppingCart();
        checkoutPage.applyPromoCode(promoCode);
    }

    @Then("the discount should be applied correctly")
    public void the_discount_should_be_applied_correctly() {
        String discount = checkoutPage.getDiscountAmount();
        String totalPrice = checkoutPage.getTotalPrice();
        
        // Example: Validate discount is applied (adjust logic based on actual calculation rules)
        Assert.assertTrue(discount.contains("10%"), "Promo code discount not applied correctly.");
        Assert.assertNotNull(totalPrice, "Total price is not updated.");
        driver.quit();
    }
}
