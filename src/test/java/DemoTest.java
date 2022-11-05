import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTest {

    public static ChromeDriver setup(){
        System.setProperty("webdriver.chrome.driver","res/chromedriver");
        return new ChromeDriver();
    }

    @Test
    void testOne(){
//        System.setProperty("webdriver.chrome.driver","res/chromedriver");
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = setup();
        driver.get("https://www.google.com");
        //driver.close();
    }

    @Test
    void testTwo(){
        WebDriver driver = setup();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();
        WebElement loginField = driver.findElement(By.id("user-name"));
        //WebElement login2 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        //driver.close();
    }





}
