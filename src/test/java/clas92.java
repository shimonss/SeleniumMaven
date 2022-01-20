import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class clas92 {
private static ChromeDriver driver;

    private static class ChromeDriver {

        private ChromeDriver() {

        }

@Test
public static void test2() {
            System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://https://www.sport5.co.il/");
    WebDriver chromeDriver = null;
    Assert.assertEquals(chromeDriver.getCurrentUrl(), sport5URL);
        }



        public static final ThreadLocal<String> sport5URL = new ThreadLocal<String>();




        private void get(String s) {
        }





        }




}
