package Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        String text = "RAHUL";
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        Alert alerts = driver.switchTo().alert();
        System.out.println(alerts.getText());
        //Thread.sleep(2000);
        alerts.accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(alerts.getText());
        alerts.accept();
        System.out.println("script pass");
        driver.close();
    }

}
