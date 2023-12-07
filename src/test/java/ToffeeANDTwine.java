import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.findByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToffeeANDTwine {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability("appPackage","com.toffeetwine");
		dc.setCapability("appActivity","com.toffeetwine.MainActivity");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
//		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
//	    String equal= driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
//	    System.out.println("Answer is:"+equal);
//		Thread.sleep(3000);
//	    driver.quit();

	}

}
