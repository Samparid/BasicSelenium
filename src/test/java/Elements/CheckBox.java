package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Check Box']")).click();
        driver.findElement(By.xpath("//span[@class='rct-text']//child::button")).click();
        driver.findElement(By.xpath("//span[text()='Home']//preceding-sibling::span[@class='rct-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='Home']//preceding-sibling::span[@class='rct-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='Desktop']//parent::label[@for='tree-node-desktop']//preceding-sibling::button")).click();
        driver.findElement(By.xpath("//span[text()='Desktop']//parent::label[@for='tree-node-desktop']//child::span[@class='rct-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='Desktop']//parent::label[@for='tree-node-desktop']//child::span[@class='rct-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='Documents']//parent::label[@for='tree-node-documents']//preceding-sibling::button")).click();
        driver.findElement(By.xpath("//span[text()='WorkSpace']//parent::label[@for='tree-node-workspace']//preceding-sibling::button")).click();
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.xpath("//span[text()='Office']//parent::label[@for='tree-node-office']//preceding-sibling::button")).click();
        driver.findElement(By.xpath("//span[text()='Documents']//parent::label//child::span[@class='rct-checkbox']")).click();

        Thread.sleep(4000);

        System.out.println("Script passed Successfully!!");
        driver.quit();

    }
}
