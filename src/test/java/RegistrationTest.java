import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{

@BeforeMethod
public void preCondition(){
    if(isLogged()){
        logout();
    }
}
    @Test
    public void RegistrationTestPositive(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        String email = "nik"+i+"@gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:" + email);

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email,password);
        submitRegistrationForm();

        Assert.assertTrue(isElementPresent(By.xpath("//button[text() = 'Sign Out']")));
        //click(By.xpath("//button[text() = 'Sign Out']"));
    }


    @Test
    public void RegistrationTestWrongEmail(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        String email = "nik"+i+"gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:" + email);

        openLoginRegistrationForm();
        fillLoginRegistrationForm(email,password);
        submitRegistrationForm();
        Assert.assertFalse(isElementPresent(By.xpath("//button[text() = 'Sign Out']")));
    }

}
