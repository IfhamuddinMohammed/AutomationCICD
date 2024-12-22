import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomnifiProductionSignup {

    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.homnifi.com/auth/signup");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys("testuser1015");

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        emailField.sendKeys("homnifitestuser1015@yopmail.com");

        WebElement confirmEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='confirmEmail']")));
        confirmEmailField.sendKeys("homnifitestuser1015@yopmail.com");
        
        driver.findElement(By.xpath("//button[@type='button']")).click();
        WebElement countryfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='search...']")));
        countryfield.sendKeys("India");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[1]/div/div[4]/div/div/div[2]/div/button")).click();

        WebElement referralCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='referralCode']")));
        referralCodeField.sendKeys("DV9X38DURSOV");

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        passwordField.sendKeys("Test@123");

        WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='confirmPassword']")));
        confirmPasswordField.sendKeys("Test@123");

        WebElement acceptTermsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='acceptTerms']")));
        acceptTermsCheckbox.click();

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/form/button/div")));
        submitButton.click();

       // driver.quit();
    }
}
