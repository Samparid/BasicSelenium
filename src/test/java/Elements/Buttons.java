package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Buttons {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        WebElement Buttons = driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Buttons']"));
        js.executeScript("arguments[0].click();", Buttons);
        WebElement doubleClickMe = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        WebElement rightClickMe = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions ac = new Actions(driver);
        ac.doubleClick(doubleClickMe).build().perform();
        System.out.println("doubleClickMe");
        Thread.sleep(4000);
        ac.contextClick(rightClickMe).build().perform();
        System.out.println("rightClickMe");
        Thread.sleep(4000);
        ac.click(click).build().perform();
        System.out.println("click");
        Thread.sleep(4000);
        driver.quit();
    }
}
