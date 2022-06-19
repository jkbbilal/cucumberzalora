package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
private void generatejvmreport(String jsonFile) {
//mention target location
	File f = new File("target\\JvmReport");
	//File f = new File(System.getProperty("user.dir")+"\\target\\JvmReport");

Configuration con = new Configuration(f, "zalora");
	con.addClassifications("platform", "Windows");
	con.addClassifications("JDK version", "1.8");
	con.addClassifications("browser", "chrome");
	//add json file
	
	List<String> l = new ArrayList<String>();
	l.add(jsonFile);

//create a object for reportbuilder
	
	ReportBuilder r = new ReportBuilder(l, con);
	r.generateReports();
	









}
}
