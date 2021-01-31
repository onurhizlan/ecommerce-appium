package ecommerce_appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.junit.Assert;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class test_case_1 extends base {

	public static void main(String[] args)  throws MalformedURLException {
		// Fill the form details and verify Toast error messages displayed appropriately for wrong inputs.

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Austin");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	 // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + United States + "\").instance(0))"));  
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String getToastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(getToastMessage);
		Assert.assertEquals("Please enter your name", getToastMessage);
		
		
		
		
		
	}

}
