import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
        Thread.sleep(5000);
        driver.quit();



    }


}
