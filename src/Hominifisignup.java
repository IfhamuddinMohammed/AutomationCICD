import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Hominifisignup {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ifham\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String signupUrl = "https://homnifi.codeinprogress.net/auth/signup";
        driver.get(signupUrl);
        for (int i = 1; i <= 20; i++) {
            try {
                String username = "testuser" + i;
                String email = "testuser" + i + "@yopmail.com";
                String confirmemail = "user" + i + "@yopmail.com";
                String country = "United Arab Emirates";
                String password = "Test@123";
                String confirmpassword = "Test@123";
                String refcode = "PV3I4AFBB4OH";
                
                WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
                //usernameField.clear();
                usernameField.sendKeys(username);
                WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
                //emailField.clear();
                emailField.sendKeys(email);
                
                WebElement confirmemailField = driver.findElement(By.xpath("//input[@name='confirmEmail']"));
                //confirmemailField.clear();
                confirmemailField.sendKeys(confirmemail);
                

                
                WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
                //passwordField.clear();
                passwordField.sendKeys(password);
             WebElement confirmpasswordField = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
            		 //confirmpasswordField.clear();
             confirmpasswordField.sendKeys(confirmpassword);
             
             WebElement Referralcode = driver.findElement(By.xpath("//input[@name='referralCode']"));
    		 //Referralcode.clear();
             Referralcode.sendKeys(refcode);
             
               
                
                // Find and click the submit button
                WebElement submitButton = driver.findElement(By.id("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/form/button/div"));
                submitButton.click();

                // Wait for some confirmation message (adjust according to your site)
               // WebDriverWait wait = new WebDriverWait(driver, 10);
               // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));

                System.out.println("User " + username + " created successfully!");

                // Optionally, log out after each signup if required
                // WebElement logoutButton = driver.findElement(By.id("logout"));
                // logoutButton.click();

                // Go back to the signup page for the next iteration (if the form resets or redirects)
                driver.navigate().refresh();  // This may be different depending on how the page works

            } catch (Exception e) {
                System.out.println("Failed to create user " + i + ": " + e.getMessage());
                // Continue the loop to attempt the next signup
                driver.navigate().refresh();  // Refresh to handle any unexpected errors
            }
        }

        // Close the browser after all signups are complete
        driver.quit();
    }
}
