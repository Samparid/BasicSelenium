package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxAssignment {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement CHECKBOX_1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
        CHECKBOX_1.click();
        CHECKBOX_1.click();
        List<WebElement> ele = driver.findElements(By.xpath("//div[@id='checkbox-example']//child::input"));
        System.out.println(ele.size());
        System.out.println("script pass");
        driver.close();

    }
}
