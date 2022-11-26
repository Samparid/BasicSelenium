package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Links {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        WebElement Links = driver.findElement(By.xpath("//div[@class='left-pannel']//child::div//child::li//descendant::span[text()='Links']"));
        js.executeScript("arguments[0].click();", Links);
        Thread.sleep(4000);
        List<WebElement> totalLinks = driver.findElements(By.xpath("//p//child::a"));

        for (WebElement ele : totalLinks) {
            String name = ele.getText();
            System.out.println(name);
            ele.click();
            Set<String> windowhandles = driver.getWindowHandles();
            System.out.println(windowhandles);
            Iterator<String> iterator = windowhandles.iterator();
            String parentwindow = iterator.next();
            driver.switchTo().window(parentwindow);
            js.executeScript("window.scrollBy(0,250)", "");
        }
        System.out.println("Script run successfully");
        driver.quit();
    }
}
