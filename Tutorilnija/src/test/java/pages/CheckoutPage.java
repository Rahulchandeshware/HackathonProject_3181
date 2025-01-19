package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    // Locators
    @FindBy(css = "input[name='search']")
    WebElement searchField;

    @FindBy(css = "button.btn.btn-default.btn-lg")
    WebElement searchButton;

    @FindBy(linkText = "MacBook")
    WebElement macBookProductLink;

    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @FindBy(linkText = "Shopping Cart")
    WebElement shoppingCartLink;

    @FindBy(linkText = "Checkout")
    WebElement checkoutButton;

    @FindBy(id = "input-coupon")
    WebElement promoCodeField;

    @FindBy(id = "button-coupon")
    WebElement applyPromoCodeButton;

    @FindBy(css = "span#total-discount")
    WebElement discountAmount;

    @FindBy(css = "span#total-price")
    WebElement totalPrice;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void searchForProduct(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
    }

    public void selectProduct() {
        macBookProductLink.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void goToShoppingCart() {
        shoppingCartLink.click();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }

    public void applyPromoCode(String promoCode) {
        promoCodeField.sendKeys(promoCode);
        applyPromoCodeButton.click();
    }

    public String getDiscountAmount() {
        return discountAmount.getText();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }
}
