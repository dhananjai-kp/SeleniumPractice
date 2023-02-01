import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();



//        WebElement fromcity = driver.findElement(By.id("fromCity"));
//        WebElement tocity = driver.findElement(By.id("toCity"));
//        Select se = new Select(fromcity);
//        se.selectByVisibleText("");

        driver.findElement(By.xpath("//a[@class = \"primaryBtn font24 latoBold widgetSearchBtn \"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=\"Non Stop\"]//preceding-sibling::span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='appendBottom15']/span")).click();
        Thread.sleep(3000);



//        Thread.sleep(3000);
//        driver.quit();
    }

}
