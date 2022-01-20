import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.id;

public class answer7 {

    private static ChromeDriver driver;
    private static ByClassName chromeDriver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/webcalculator/");
        System.out.println(chromeDriver.findElement((SearchContext) id("2")).getRect().getHeight());
        System.out.println(chromeDriver.findElement((SearchContext) id("6")).getRect().getWidth());
    }

    @AfterClass
            public void afterAll() {
    driver.quit();

    }
}
