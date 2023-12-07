import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
	    String equal= driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
	    System.out.println("Answer is:"+equal);
//		Thread.sleep(3000);
//	    driver.quit();
	}

}
