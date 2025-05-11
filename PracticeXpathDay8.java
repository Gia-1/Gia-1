package baitapvenha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.CommonBase;

public class PracticeXpathDay8 extends CommonBase {

    @BeforeMethod
    public void init() {
        driver = initChromeBrowser("https://automationfc.github.io/basic-form/index.html");
    }

    @Test
    public void testLocateElements() {      
        WebElement GấuMập = driver.findElement(By.id("name"));
        System.out.println("Element name: " + GấuMập);      
        WebElement BìnhĐịnh = driver.findElement(By.name("address"));
        System.out.println("Element address: " + BìnhĐịnh);
        WebElement email = driver.findElement(By.id("email"));
        System.out.println("Email : " + email);
        WebElement password = driver.findElement(By.id("password"));
        System.out.println("Password : " + password);
    }
        @Test
        public void locateElementByTagName() {
        	WebElement Submit = driver.findElement(By.tagName("button[type='submit']"));
            System.out.println(" button : " +Submit);
            WebElement Reset = driver.findElement(By.tagName("button[type='reset']"));
            System.out.println(" button:  " + Reset);
        	
       
    
    }
}

