package Com.Flipkart.StepDefinition;

import java.time.LocalTime;

import Com.Flipkart.Resources.CommonAction;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction c = new CommonAction();
	@Before
	public void beforeScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Starts time: " +now);
		c.flipkart_Login("https://www.flipkart.com/");
	}

	@After
	public void afterScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("End time: " +now);
	}

}
