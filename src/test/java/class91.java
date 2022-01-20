import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class class91 {
    private static final String SEVEN = null;
    private static WebDriver driver;


    @BeforeClass
    public static void beforeClass() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void aboveTest() {
        Object Constants = null;
        System.out.println(driver.findElement(By.id(SEVEN)).getSize());
        System.out.println(driver.findElement(By.id("six")).isDisplayed());
        WebCalculatorPage.pressOne();
        WebCalculatorPage.pressPlus();
        WebCalculatorPage.pressNine();
        WebCalculatorPage.pressEquals();
        String expectedResult = "10";
        assertEquals(expectedResult, WebCalculatorPage.getResult());


    }

    private class SEVEN {
    }

    private static class WebCalculatorPage {
        public static void pressOne() {
        }

        public static void pressPlus() {
        }

        public static void pressNine() {
        }

        public static void pressEquals() {
        }

        public static int getResult() {

            return 0;
        }
    }
}

