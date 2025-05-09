package baitapvenha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.CommonBase;  

public class locate_element extends CommonBase {
    @BeforeMethod
    public void init() {
        driver = initChromeBrowser("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void testLocateElements() {
        WebElement Useremail = driver.findElement(By.id("shub69"));
        System.out.println("Element useremail: " + Useremail);
        WebElement Password = driver.findElement(By.id("pass"));
        System.out.println("Element Password: " + Password);
        WebElement LSB = driver.findElement(By.name("company"));
        System.out.println("Element company: " + LSB);
        WebElement MobileNumber = driver.findElement(By.name("mobile number"));
        System.out.println("Element mobile number: " + MobileNumber);
    }
}

