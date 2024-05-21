package comsaucedemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class BrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver;

        driver = new ChromeDriver();

        // 2. Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //3. Print the title of the page.
        System.out.println("title page: " + driver.getTitle());
        // 4. Print the current url.
        System.out.println("current url: " + driver.getCurrentUrl());
        // 5. Print the page source.
        System.out.println("page source: " + driver.getPageSource());
        // 6. Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // 7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // 8. Click on Login Button.
        driver.findElement(By.id("login-button")).click();
        //  9. Print the current url.
        System.out.println("page title: " + driver.getCurrentUrl());
        // 10. Navigate to baseUrl
        driver.navigate().to(baseUrl);
        //11. Refresh the page.
        driver.navigate().refresh();
        //12. Close the browser.
        driver.quit();

    }
}
