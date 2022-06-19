package org.stepdefinition2;

import java.io.IOException;

import org.utilities.baseclass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends baseclass {
@Before
public void bftc() throws InterruptedException {
	launchchrome();
	winmax();
	loadurl("https://www.zalora.sg/");
	
}
@After
public void aftc(Scenario s) throws IOException {
String name = s.getName();
String name1 = name.replaceAll(" ", "_");
takesnap(name1);
System.out.println("after ends");
driver.close();
}

}
