package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductSearchPage {
    WebDriver driver;

    // Locators
    @FindBy(name = "search")
    WebElement searchField;

    @FindBy(css = "button.btn.btn-default.btn-lg")
    WebElement searchButton;

    @FindBy(css = "div.product-thumb")
    List<WebElement> productResults;

    @FindBy(css = "select#input-sort")
    WebElement sortDropdown;

    @FindBy(css = "input[name='price_range']")
    WebElement priceRangeFilter;

    @FindBy(xpath = "//label[contains(text(),'Laptops & Notebooks')]/input")
    WebElement categoryFilter;

    @FindBy(xpath = "//label[contains(text(),'4 stars and above')]/input")
    WebElement ratingFilter;

    // Constructor
    public ProductSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void searchForProduct(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
    }

    public int getProductCount() {
        return productResults.size();
    }

    public void applyCategoryFilter() {
        categoryFilter.click();
    }

    public void applyPriceRangeFilter(String priceRange) {
        priceRangeFilter.sendKeys(priceRange);
    }

    public void applyRatingFilter() {
        ratingFilter.click();
    }

    public void sortResults(String sortBy) {
        sortDropdown.sendKeys(sortBy);
    }

    public List<WebElement> getProductResults() {
        return productResults;
    }
}
