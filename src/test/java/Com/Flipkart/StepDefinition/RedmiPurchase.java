package Com.Flipkart.StepDefinition;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Ignore;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import Com.Flipkart.ObjectRepostry.Validations;
import Com.Flipkart.Resources.CommonAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RedmiPurchase extends CommonAction{
		CommonAction c = new CommonAction();
		Validations v = new Validations();
String name="";
@Given("Flipkart Login")
public void flipkart_Login() {
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		v.getClose().click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

@When("Redmi Mobile Search {string}")
public void redmi_Mobile_Search(String str) {
		name=str;
		c.redmi_Mobile_Search(v.getSearch(), name);
}

@When("Taking product list")
public void taking_product_list() throws Exception {
	c.taking_product_list(name, v.getProduct(), v.getProductPrice());
   
}

@When("Clicking Product")
public void clicking_Product() throws IOException {
		c.clicking_Product(v.getFilter(), v.getProduct().get(0));
}

@When("Windows Handling")
public void windows_Handling() {
		c.windows_Handling();
}

@When("Screenshot{int}")
public void screenshot(int a) throws Exception {
	a=1;
		c.screenshot(name+"a");  
}

@When("Validation")
public void validation() throws Exception {
c.validation(name, v.getProductName().getText(), v.getProductPrice());
}

@When("Presentation")
public void Presentation()
{
	c.present(v.getAvailable(), v.getBuynow());
}

@When("Radio button")
public void radio_button() throws InterruptedException

{
	c.radio(v.getRadio1(), v.getRadio2(), v.getPin(), v.getNV());
	Thread.sleep(5000);
	v.getClose().click();
	Thread.sleep(5000);
	v.getCancel().click();
	Thread.sleep(3000);
//	v.getRadio2().click();
	
	v.getCart().click();
}

@When("Delivery Details")
public void delivery_Details() {
	c.delivery_Details(v.getDelivryby());
}
@When("Price Details")
public void Price_Details() throws Exception {
	c.pricedetails(v.getPricedetails(), v.getPrices(), v.getAmts(), v.getDisprice());
	c.screenshot(name+"2");
}

@Then("quit")
public void quit() {
    c.clos();
    }
	}