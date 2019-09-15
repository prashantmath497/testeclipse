package com.uiFramework.vmd.proj.testScript;

import org.testng.annotations.Test;

import com.uiFramework.vmd.proj.testbase.TestBase;

public class TestScreenShot extends TestBase 
{

	 @Test
	 public void testScreen()
	 {
		 driver.get("https://www.policybazaar.com/");
		 captureScreen("firstscreen");
	 }
}
