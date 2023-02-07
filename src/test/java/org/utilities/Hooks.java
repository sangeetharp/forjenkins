package org.utilities;

import io.cucumber.java.After;

public class Hooks extends BaseClass{
	@After
	public static void closeTheTab() {
		driver.close();
	}

}
