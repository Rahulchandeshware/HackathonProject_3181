package stepdfinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.ProductSearchPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSearchSteps {
    WebDriver driver;
    ProductSearchPage productSearchPage;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
               driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        productSearchPage = new ProductSearchPage(driver);
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String productName) {
        productSearchPage.searchForProduct(productName);
    }

    @And("the user applies filters for category {string}, price range {string}, and rating {string}")
    public void the_user_applies_filters(String category, String priceRange, String rating) {
        productSearchPage.applyCategoryFilter(); // Adjust this method to match the actual category filter locator
        productSearchPage.applyPriceRangeFilter(priceRange); // Adjust for actual implementation
        productSearchPage.applyRatingFilter(); // Adjust for actual rating filter
    }

    @Then("the user should see filtered results matching the criteria")
    public void the_user_should_see_filtered_results_matching_the_criteria() {
        int productCount = productSearchPage.getProductCount();
        Assert.assertTrue(productCount > 0, "No products match the applied filters.");
        driver.quit();
    }

    @When("the user sorts results by {string}")
    public void the_user_sorts_results_by(String sortBy) {
        productSearchPage.sortResults(sortBy);
    }

    @Then("the products should be sorted by price in ascending order")
    public void the_products_should_be_sorted_by_price_in_ascending_order() {
        List<WebElement> products = productSearchPage.getProductResults();
        List<Double> actualPrices = new ArrayList<>();
        for (WebElement product : products) {
            String priceText = product.findElement(By.cssSelector(".price")).getText().replace("$", "");
            actualPrices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(actualPrices);
        Collections.sort(sortedPrices);

        Assert.assertEquals(actualPrices, sortedPrices, "Products are not sorted by price in ascending order.");
        driver.quit();
    }
}
