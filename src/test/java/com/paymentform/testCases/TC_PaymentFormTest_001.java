package com.paymentform.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.paymentform.pageObjects.PaymentFormPage;

public class TC_PaymentFormTest_001 extends BaseClass {

    @Test
    public void paymentFormTest() {
        driver.get(baseURL);
        PaymentFormPage pfp = new PaymentFormPage(driver);

        pfp.setCreditCardNumber("1234567890123456");
        pfp.setExpiryDate("12/2023");
        pfp.setCVV("123");
        pfp.setCardHolderName("John Doe");
        pfp.clickTermsAndConditions();

        if(pfp.isSubmitEnabled()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }
}