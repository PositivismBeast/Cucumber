package com.reports;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.base.Baseclass;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see Report Generation For Our TestCases
 *
 */
public  class Reporting extends Baseclass {
	
	/**
	 * 
	 * @param jsonfile
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see JvmReport Genaration Process
	 */
	public static void generateJvmReport(String jsonfile) throws FileNotFoundException, IOException {
		
		File file = new File(System.getProperty("user.dir")+getPropertiesFileValue("jvmpath"));
		
		Configuration confi = new Configuration(file,"mani12");
		
		confi.addClassifications("Browser", "Chrome");
		confi.addClassifications("Version", "104");
		confi.addClassifications("OS", "Win10");
		confi.addClassifications("Sprint", "21");
		confi.addClassifications("Testing", "Regrassion");
			
		List<String>jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles, confi);
		
		builder.generateReports();
				
	}

}
