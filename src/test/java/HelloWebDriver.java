import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev");
        Thread.sleep(5000);
       // WebElement downloadButton = driver.findElement(By.id("main_navbar"));
       // downloadButton.sendKeys("selenium java");
        WebElement downloadButton = driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[2]/a/span"));
        downloadButton.click();
        Thread.sleep(5000);

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("C:\\Users\\Viktoriia_Andriichen\\OneDrive - EPAM\\Vika\\Screenshotsu\\Screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();

       driver = new EdgeDriver();
        Thread.sleep(5000);
       driver.get("https://www.selenium.dev");
       Thread.sleep(2000);
       driver.quit();

//        driver = new FirefoxDriver();
//        driver.get("https://www.selenium.dev");
//        Thread.sleep(2000);
//        driver.quit();
    }
}
