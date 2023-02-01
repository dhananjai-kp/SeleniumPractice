import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.get("http://139.59.91.96:5001/selenium-workbook/");
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//a[text()= 'Inline Frames']")).click();
//        driver.switchTo().frame("frame-1");
//        driver.switchTo().frame("frame-2");
//
//        driver.switchTo().defaultContent();




//        driver.get("http://139.59.91.96:5001/selenium-workbook");
//        driver.findElement(By.xpath("//a[text() = 'Pop-ups']")).click();
//        driver.findElement(By.xpath("//a[@id = 'alert']")).click();
//        driver.findElement(By.linkText("Alert!")).click();
//
//        Alert alert = driver.switchTo().alert();
//        Thread.sleep(3000);
//        alert.accept();
//        driver.switchTo().defaultContent();

//        driver.findElement(By.id("alert"));
//        Alert alert1 = driver.switchTo().alert();
//        Thread.sleep(3000);
//        alert1.dismiss();
//        driver.findElement(By.xpath("//a[text()='Prompt']")).click();
//        Alert alert2 = driver.switchTo().alert();
//        Thread.sleep(3000);
//        alert2.sendKeys("sasdasdfsafsdaf");


        driver.get("http://139.59.91.96:5001/selenium-workbook/registration-form.html");
        WebElement dropdown  = driver.findElement(By.name("hearAbout"));
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Advert");



        Thread.sleep(10000);
        //driver.quit();
    }

}
