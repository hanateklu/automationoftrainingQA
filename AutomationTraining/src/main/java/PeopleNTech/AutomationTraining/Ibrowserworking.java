package PeopleNTech.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {
static WebDriver driver; // webdriver is interface
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	i) how to open the browser
	//	ii)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hana\\eclipse-workspace\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
Thread.sleep(4000);
driver.manage().window().maximize();
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
Thread.sleep(4000);
String windowhandle=driver.getWindowHandle();
System.out.println(windowhandle);
String urlofbrowser=driver.getCurrentUrl();
System.out.println(urlofbrowser);
driver.close();
	}

}
