package com.uiFramework.vmd.proj.helper.select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.uiFramework.vmd.proj.helper.logger.LoggerHelper;

public class DropDownHelper {
private WebDriver driver;
private Logger log=LoggerHelper.getLogger(DropDownHelper.class);

public DropDownHelper(WebDriver driver) {
	this.driver=driver;
	log.info("DropDownHelper Object is created ...");
}

public void selectUsingValue(WebElement element,String value )
{
	Select select = new Select(element);
	select.selectByValue(value);
	log.info("selectUsingValue");
}


public void selectUsingIndex(WebElement element,int index )
{
	Select select = new Select(element);
	select.selectByIndex(index);
	log.info("selectUsingIndex");
}

public void selectUsingVisibleText(WebElement element,String visibleText )
{
	Select select = new Select(element);
	select.selectByVisibleText(visibleText);
	log.info("selectUsingVisibleText");
}

public List<String> getAllDropDownData(WebElement element)
{
	Select select= new Select(element);
List<WebElement>  elementList =select.getOptions();
List<String> valueList= new LinkedList<String>();
for(WebElement ele:elementList)
{
	log.info(ele.getText());
	valueList.add(ele.getText());
}
return valueList;
}



}
