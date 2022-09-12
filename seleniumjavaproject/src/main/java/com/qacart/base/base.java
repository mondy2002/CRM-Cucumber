package com.qacart.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	public static WebDriver driver;
	public static Properties props =new Properties();
	
	
	
	public base ()
	{
		try {
			File file = new File("C:\\Users\\Mass\\eclipse-workspace\\seleniumjavaproject\\src\\main\\java\\propereties\\config.properties");
			FileInputStream fis = new FileInputStream(file);
		    props.load(fis);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void launchbrowser()
	{
	if (props.getProperty("browser").equalsIgnoreCase("chrome"))
	{
    System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
	   
		 driver =new ChromeDriver();
			driver.manage().window().maximize();

	}
	else if (props.getProperty("browser").equalsIgnoreCase("edge"))
	{
	      System.setProperty("webdriver.edge.driver", "C:\\browsers\\msedgedriver.exe");
		   driver =new EdgeDriver();
			driver.manage().window().maximize();

	}
	else
	{
		System.out.println("browser is not defined");
	}
	
//		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
//			 driver =new ChromeDriver();
			driver.get(props.getProperty("URL"));
	}

}
