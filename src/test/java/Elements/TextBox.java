package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TextBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Text Box']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Samrat Keshri Parida");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("samrat.keshri.24@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("B52 , jal vihar colony, nagpur");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("plot no 54/750 shri keshetra nagar , kesura");
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        System.out.println("Script passed Successfully!!");
        driver.quit();
    }
}
