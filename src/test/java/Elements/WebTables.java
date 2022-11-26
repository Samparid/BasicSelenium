package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTables {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        WebElement webtable = driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Web Tables']"));
        js.executeScript("arguments[0].click();", webtable);
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Samrat");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Parida");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Samrat.keshri.24@gmail.com");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("28");
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("71000");
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("IT");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        List<WebElement> firstNames = driver.findElements(By.xpath("//div[@class='rt-tr-group']//child::div[@class='rt-td'][1]"));
        List<WebElement> lastNames = driver.findElements(By.xpath("//div[@class='rt-tr-group']//child::div[@class='rt-td'][2]"));
        List<WebElement> age = driver.findElements(By.xpath("//div[@class='rt-tr-group']//child::div[@class='rt-td'][3]"));
        List<WebElement> email = driver.findElements(By.xpath("//div[@class='rt-tr-group']//child::div[@class='rt-td'][4]"));
        for (WebElement ele : firstNames) {
            String fname = ele.getText();
            System.out.println(fname);
        }
        for (WebElement ele : lastNames) {
            String lname = ele.getText();
            System.out.println(lname);
        }
        for (WebElement ele : age) {
            String age1 = ele.getText();
            System.out.println(age1);
        }
        for (WebElement ele : email) {
            String email1 = ele.getText();
            System.out.println(email1);
        }

        System.out.println("Script passed Successfully!!");

        driver.quit();


    }
}
