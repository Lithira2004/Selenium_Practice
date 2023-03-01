package org.example;

import org.testng.annotations.Test;

public class AppleTest extends BaseTest{

    @Test
    public void productTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage();
        homePage.search("Apple iPhone SE 2nd Generation, US Version, 64GB, Black - Unlocked (Renewed)");
        ApplePage applePage = new ApplePage(driver);
        applePage.brand();
        applePage.priceRange("20", "150");
        applePage.storage();
        applePage.verifyElement();
    }
}
