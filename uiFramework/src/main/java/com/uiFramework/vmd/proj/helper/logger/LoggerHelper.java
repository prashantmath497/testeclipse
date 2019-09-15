package com.uiFramework.vmd.proj.helper.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.uiFramework.vmd.proj.helper.resource.ResourceHelper;

//import com.uiFramework.companyName.projectName.helper.resource.ResourceHelper;

public class LoggerHelper {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
	//PropertyConfigurator.configure(ResourceHelper.getResourcePath("F://Selenium Works//workspace//uiFramework//src//main//resources//configFile//log4j.properties"));
		PropertyConfigurator.configure("F:/Selenium Works/workspace/uiFramework/src/main/resources/configFile/log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
//	public static void main(String[] args) {
//		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
//		log.info("logger is configured");
//		log.info("logger is configured");
//		log.info("logger is configured");
//		
//	}
}
