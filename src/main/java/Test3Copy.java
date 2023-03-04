import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3Copy {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//a[text() = \"Search\"]")).click();
        Thread.sleep(5000);

        WebElement popup = driver.findElement(By.xpath("//button[contains(@class, \"relative\") ]"));

        driver.switchTo().frame(popup);

        Thread.sleep(3000);
        driver.quit();
    }
}
