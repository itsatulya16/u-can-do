package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import facebook2Test.Base2;


public class utility_ extends Base2{
	WebDriver driver;
	public utility_(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String fetchdata(int x,int y) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\Lenovo\\Desktop\\fetch2.xlsx";
		
		FileInputStream File=new FileInputStream(path);
		Workbook a=WorkbookFactory.create(File);
	Sheet b=	a.getSheet("fetch2");
	 String value =b.getRow(x).getCell(y).getStringCellValue();
		System.out.println(value);
		return value;
		
	}
	
	
	public void screenshot(String name) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\Desktop\\pro sc meth\\"+name+".jpg");
		FileHandler.copy(src, dest);
		
		
	}
	
	
	public static  String propert(String key) throws IOException {
		String path="D:\\atul_pro_maven\\src\\test\\java\\facebook2Test\\atuldata.properties";
		Properties p=new Properties();
		FileInputStream input=new FileInputStream(path);
		p.load(input);
		System.out.println(p.get(key));
	  String value= p.getProperty(key);
		return value;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
