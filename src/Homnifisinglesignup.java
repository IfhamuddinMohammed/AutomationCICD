import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Homnifisinglesignup {

    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        driver.get("https://homnifi.codeinprogress.net/auth/signup");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys("supernodetest2.1");

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        emailField.sendKeys("supernodetest2.1@yopmail.com");

        WebElement confirmEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='confirmEmail']")));
        confirmEmailField.sendKeys("supernodetest2.1@yopmail.com");
        

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search...']")));

        searchInput.sendKeys("United Arab Emirates");
        searchInput.sendKeys(Keys.ENTER); 
        
  
        //WebElement dropdown = driver.findElement(By.xpath("//button[@type='button']"));
        //dropdown.click();
        //WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='search...']"));
        //searchBox.sendKeys("United Arab Emirates");
        
        //searchBox.sendKeys(Keys.ENTER);  
        
        //Select select = new Select(dropdown);
        //select.selectByVisibleText("United Arab Emirates");
        //WebElement selectedOption = select.getFirstSelectedOption();
        //System.out.println("Selected option: " + selectedOption.getText());

        // Example 2: Select by index (index starts from 0)
        // select.selectByIndex(2);  // selects the 3rd option in the dropdown

        // Example 3: Select by value
        // select.selectByValue("optionValue");  // selects the option with the value attribute

        //WebElement selectedOption = select.getFirstSelectedOption();
 
        //driver.findElement(By.xpath("//button[@type='button']")).click();
        //WebElement searchInput = driver.findElement(By.cssSelector("input[placeholder='search...']"));
        //searchInput.sendKeys("United Arab Emirates");
        //List<WebElement> options = driver.findElements(By.xpath("//div[@style='z-index: 99;']")); 
      
        
        //for (WebElement option : options) {
            //if (option.getText().equalsIgnoreCase("United Arab Emirates")) {
                //option.click();
                //break;
            //}
        //}
        WebElement referralCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='referralCode']")));
        referralCodeField.sendKeys("PGSMYHOZAIOM");

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
