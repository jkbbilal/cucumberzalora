package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
public static void launchchrome() {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
}
public static void loadurl(String url) {
	driver.get(url);
}
public static void winmax() {
driver.manage().window().maximize();
}
public static void fillemail(WebElement ele, String value) {
ele.sendKeys(value);
}
public static void fillpass(WebElement ele, String value) {
ele.sendKeys(value);
}
public static void loginbuttonclick(WebElement ele) {
ele.click();
}
public static void Dateandtime() {
Date d = new Date();
System.out.println(d);
}
public static void browserclose() {
driver.close();
}
public static String getdata(int rownumber, int cellnumber) throws IOException {
File f = new File("C:\\Users\\mohammed\\eclipse-workspace\\CucumberTask\\target\\TestData\\datahotelbooking.xlsx");
FileInputStream fi = new FileInputStream(f);

Workbook w = new XSSFWorkbook(fi);
Sheet s = w.getSheet("hotelbookingdata");
Row r = s.getRow(rownumber);
Cell c = r.getCell(cellnumber);
int type = c.getCellType();
String value = "";
if (type==1) {
	 value = c.getStringCellValue();
}
else if (DateUtil.isCellDateFormatted(c)) {
	Date d = c.getDateCellValue();
SimpleDateFormat sim = new SimpleDateFormat("DD/MM/YYYY");
value = sim.format(d);
}
else {
	double d = c.getNumericCellValue();
long l = (long)d;
value = String.valueOf(l);

}
return value;

}
public static void dateandtime() {
Date d = new Date();
System.out.println(d);
}

public static void impwait() {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

}
}
