import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

    }

    @Test
    public void loginPositiveTest(){
        WebElement loginBtn = wd.findElement(By.xpath("//*[text()='LOGIN']"));
        loginBtn.click();

        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("noa@gmail.com");

        WebElement password = wd.findElement(By.xpath("//input[2]"));
        password.click();
        password.clear();
        password.sendKeys("Nnoa12345$");

        WebElement clickButton = wd.findElement(By.xpath("//button[1]"));
        clickButton.click();


        /*WebElement so = wd.findElement(By.xpath(//button));
       // String ss = so.getText();
        System.out.println(ss);
        Assert.assertEquals(ss,"Sign Out");*/






    }

    @AfterMethod
    public void tearDown(){
       // wd.quit();
    }
}

