import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class answer3 {
    private static WebDriver driver;
    private WebDriver chromeDriver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ynet.co.il");
    }

    @Test
    public void test3_test_title() {
        String ynetTitle = "חדשות, כלכלה, ספורט ובריאות - דיווחים שוטפים מהארץ ...ynet";
        chromeDriver.navigate().refresh();
    }

        @Test
                public void test_method_1(){
            String ynetTitle = null;
            Assert.assertEquals(chromeDriver.getTitle(), null);

        }


    }

