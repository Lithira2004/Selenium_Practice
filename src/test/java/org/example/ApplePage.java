package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ApplePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Apple']")
    WebElement brandBox;

    @FindBy(xpath = "//input[@id='low-price']")
    WebElement minPrice;

    @FindBy(xpath = "//input[@id='high-price']")
    WebElement maxPrice;

    @FindBy(xpath = "//*[@id='p_n_feature_twelve_browse-bin/14674910011']/span/a/div/label/i")
    WebElement storage;

    @FindBy(xpath = "//span[text()='Apple iPhone SE 2nd Generation, US Version, 64GB, Black - Unlocked (Renewed)']")
    WebElement product;


    public ApplePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void brand() {

        brandBox.click();

    }

    public void priceRange(String minprice, String maxprice) {
        minPrice.sendKeys(minprice);
        maxPrice.sendKeys(maxprice);
    }

    public void storage() {
        storage.click();
    }

    public void verifyElement() {
        String name = "Apple iPhone SE 2nd Generation, US Version, 64GB, Black - Unlocked (Renewed)";
        String actualName = product.getText();
        Assert.assertEquals(name, actualName);
        product.click();


    }





}
