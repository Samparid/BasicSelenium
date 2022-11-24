package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Radio Button']")).click();
        WebElement yes_Radio=driver.findElement(By.xpath("//input[@id='yesRadio']"));
        js.executeScript("arguments[0].click();", yes_Radio);
        Thread.sleep(4000);
        WebElement impressive_Radio =driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        js.executeScript("arguments[0].click();", impressive_Radio);
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("//input[@id='noRadio']")).isSelected());
        driver.quit();
    }
}
