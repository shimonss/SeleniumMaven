import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class answer4 {

    private static chromeDriver chromeDriver;
    private static Object chromeOptions;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
options.addArguments("-disable extensions");
chromeDriver = new chromeDriver(chromeOptions);


    }
    @Test
    public void test4_extensions() {

    }

    private static class chromeDriver {
        public chromeDriver(Object chromeOptions) {
        }
    }
}
