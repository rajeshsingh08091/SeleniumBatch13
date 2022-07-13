import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

    public static class LaunchBrowser {
        public static  void main(String[] args){
            System.setProperty("webdriver.chrome.driver"," drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("http://www.google.com");

            String url = driver.getCurrentUrl();
            System.out.println(url);

            String title = driver.getTitle();
            System.out.println(title);
            driver.quit();
        }
    }

}
