package luma.us.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.us.basepage.Basepage;

public class Hooks extends Basepage {

@Before
public void getSetup() {
	Basepage.getAutomationStart();
	
}

@After
public void tearDown() {
	driver.quit();
		
}

}
