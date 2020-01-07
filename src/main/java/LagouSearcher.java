import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LagouSearcher {
    public static void main(String[] args) {
        //告诉系统webdriver的位置
        //通过反射机制，拿到类中的resources下面的文件路径
        System.setProperty("webdriver.chrome.driver",LagouSearcher.class.getClassLoader().getResource("chromedriver.exe").getPath());
        WebDriver webDriver = new ChromeDriver();
        //通过webdriver访问指定页面
        webDriver.get("https://www.lagou.com/zhaopin/Java/?labelWords=label");
    }
}
