package Com.Flipkart.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CommonAction  {
public static WebDriver driver;
public void flipkart_Login(String url) {
	System.out.println("Browser Laucnh");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DD\\workspace\\Cucumbertest\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	}

public void redmi_Mobile_Search(WebElement ele, String string) {
System.out.println("Searching mobile");
 ele.sendKeys(string, Keys.ENTER);
 
}


public void taking_product_list( String s, List<WebElement> a, WebElement b) throws Exception {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("EXCEL CREATION");
  
	  File xl = new File("C:\\Users\\DD\\Desktop\\xl.xlsx");
  
    FileInputStream f = new FileInputStream(xl);
    Workbook wb = new XSSFWorkbook(f);
    Sheet sht = wb.createSheet(s);
    for(int i=0; i<a.size();i++)
    {
    Row row = sht.createRow(i);
    Cell cell = row.createCell(0);
    cell.setCellValue(a.get(i).getText());
            }
      Row row = sht.getRow(0);
   Cell cell1 = row.createCell(1);
   cell1.setCellValue(b.getText());
   FileOutputStream x =  new FileOutputStream(xl);
 wb.write(x);
}

public void clicking_Product(WebElement Filter, WebElement product )  {
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	Filter.click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   	product.click();
}

public void windows_Handling() {
	Set<String> windowHandles = driver.getWindowHandles();
	ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
	driver.switchTo().window(arrayList.get(1));
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 }

public void screenshot(String filename) throws Exception {
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\DD\\workspace\\Flipkart\\target\\"+filename+".png");
  	FileUtils.copyFile(src, trg); 
}

public void validation(String s,  String Pname, WebElement price) throws Exception {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  File xl = new File("C:\\Users\\DD\\Desktop\\xl.xlsx");
    FileInputStream f = new FileInputStream(xl);
    Workbook wb = new XSSFWorkbook(f);
    Sheet sht = wb.getSheet(s);
    Row row = sht.getRow(0);
    Cell cell = row.getCell(0);
    String scv = cell.getStringCellValue();
    boolean contains = Pname.contains(scv);
   Assert.assertTrue(contains);
    System.out.println("product Equal");
    Cell cell2 = row.getCell(1);
    String pric =cell2.getStringCellValue();
    System.out.println(pric);
    System.out.println(price.getText());
    Assert.assertEquals(pric, price.getText());
      System.out.println("PRICE Equal");
}

public void present(WebElement avai, WebElement Buynow)
{
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    boolean displayed = avai.isDisplayed();
   Assert.assertTrue(displayed); 
    System.out.println("Available offeer Displayed");
    boolean displayed2 = Buynow.isDisplayed();
  Assert.assertTrue(displayed2); 
    System.out.println("BUY NOW button Displayed");
}

public void radio(WebElement r1,WebElement r2, WebElement pin, WebElement msg) throws InterruptedException
{
	 Thread.sleep(3000);
	 if(r1.isSelected()){
		System.out.println("(RADIO1)Buy without is enabled default");
		}
	
		System.out.println("entering pincode");
		pin.sendKeys("123456", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text = msg.getText();
		if(text.contains("Not a valid"))
		{
			System.out.println("Not valid pincode printed");
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
for(int i=0; i<6;i++)
{
		pin.sendKeys(Keys.BACK_SPACE);
}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		pin.sendKeys("600002", Keys.ENTER);
		Thread.sleep(15000);
		try
		{
			
		r2.click();
			}
		catch (StaleElementReferenceException e){
		System.out.println("Exchange offer selected");}
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
}
public void delivery_Details( WebElement dlvryy){
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	System.out.println( dlvryy.getText());
    }
public void pricedetails(WebElement head, List<WebElement> prices, List<WebElement> amts, WebElement dis) throws InterruptedException
{
	Thread.sleep(3000);
System.out.println(head.getText());
System.out.println(prices.get(0).getText()+ "  "+ amts.get(0).getText());
System.out.println(prices.get(1).getText()+"  "+dis.getText());

for(int i =2; i<prices.size()-1;i++)
		{

	WebElement x =prices.get(i);
	WebElement y =amts.get(i-1);
	
	System.out.println(x.getText()+"  "+ y.getText());
	
		}}

public void clos()
{
	driver.quit();
}


}
