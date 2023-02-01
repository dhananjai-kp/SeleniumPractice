import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(100, 400));
        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getSize());

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();


        Thread.sleep(3000);
        driver.quit();
    }


}
