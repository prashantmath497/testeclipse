package com.uiFramework.vmd.proj.helper.browserConfiguration.config;

import com.uiFramework.vmd.proj.helper.browserConfiguration.BrowserType;

/**
 * 
 * @author Bhanu Pratap Singh
 *
 */
public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();

}
