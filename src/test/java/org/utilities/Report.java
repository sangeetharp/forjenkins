package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
public static void createJvmReport(String jvmFilePath) {
	File f= new File("C:\\Users\\praba\\CucumberFlipkart\\Reports\\junit.xml");
	
	Configuration c=new Configuration(f,"Flipkart"); 
	c.addClassifications("name","windows");
	
	
	
	List<String>l= new ArrayList<String>();
	l.add(jvmFilePath);
	
ReportBuilder r = new ReportBuilder(l, c);
r.generateReports();
}


}
