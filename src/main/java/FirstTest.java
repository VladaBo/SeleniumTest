import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void checkMinSum(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://next.privat24.ua/mobile");

        driver.findElement(By.xpath("//input[@data-qa-node='phone-number']")).sendKeys("675308438");
        driver.findElement(By.xpath("//input[@data-qa-node='amount']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@data-qa-node='numberdebitSource']")).sendKeys("4506909324274797");
        driver.findElement(By.xpath("//input[@data-qa-node='expiredebitSource']")).sendKeys("01/22");
        driver.findElement(By.xpath("//input[@data-qa-node='cvvdebitSource']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@data-qa-node='firstNamedebitSource']")).sendKeys("Peter");
        driver.findElement(By.xpath("//input[@data-qa-node='lastNamedebitSource']")).sendKeys("Scrogg");

        driver.findElement(By.xpath("//button[@data-qa-node='submit']")).click();


    }
}
