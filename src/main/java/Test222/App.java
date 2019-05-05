
/**
Тест гугл Формы
 *
 */
package Test222;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

/**
 * Hello world!
 *
 */
public class App {

    private final static String URL = "https://docs.google.com/forms/d/e/1FAIpQLSeO0vepsNoqUATLNKYDvLQSAt0Y8sHd5CxW5ShBwJ3uBt19lA/viewform";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/apps/selenium/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);

        //Find the text input element by its name
        WebElement value1 = driver.findElement(cssSelector("input[aria-label=\"Ваше Имя:\"]"));
        //WebElement nameTag = driver.findElement(By.cssSelector("input[aria-label=\"Имя\"]"));
        // Enter something as value 1
        value1.sendKeys("Hello");
        Thread.sleep(1000);
        //WebElement value1 = driver.findElement(cssSelector("div[role=\"listitem\"] label"));

        List<WebElement> allLabels = driver.findElementsByCssSelector("div[role='listitem'] label");


        //WebElement allLabels = driver.findElementsByCssSelector( "div[role="listitem"] label");






        allLabels.get(1).click();
        Thread.sleep(1000);
        // pol = M
        allLabels.get(5).click();
        Thread.sleep(1000);
        // za/net = Za
        allLabels.get(7).click();
        Thread.sleep(3000);

        driver.quit();

    }
}

