import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev");
        Thread.sleep(3000);
       // WebElement downloadButton = driver.findElement(By.id("main_navbar"));
       // downloadButton.sendKeys("selenium java");
        WebElement downloadButton = driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[2]/a/span"));
        downloadButton.click();
        Thread.sleep(3000);

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("C:\\Screenshots\\Screenshot_Chrom.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();

        driver = new FirefoxDriver();
       driver.get("https://www.selenium.dev");
       Thread.sleep(3000);
        downloadButton = driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a"));
        downloadButton.click();
       Thread.sleep(3000);
        scrShot =((TakesScreenshot)driver);
        SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("C:\\Screenshots\\Screenshot_Mozilla.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
       driver.quit();

    }
}
