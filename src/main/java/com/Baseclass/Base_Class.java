package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static String value;
	

	public static WebDriver getBrowser(String Type) {
		if (Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Baskar\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}  else if (Type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Baskar\\eclipse-workspace\\AdactinCucumber\\Driver2\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Type.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void navigate_to(String url) {
		driver.navigate().to(url);
	}

	public static void navigate_back() {
		driver.navigate().back();
	}

	public static void navigate_forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void confirm_alert() {
		driver.switchTo().alert().accept();
	}

	public static void dismiss_alert() {
		driver.switchTo().alert().dismiss();
	}

	public static void prompt_alert(String key) {
		driver.switchTo().alert().sendKeys(key);
		driver.switchTo().alert().accept();
	}

	public static void Action_class(WebElement element, String action) {
		Actions a = new Actions(driver);
		if (action.equalsIgnoreCase("Rightclick")) {
			a.contextClick(element).build().perform();
		}

		else if (action.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (action.equalsIgnoreCase("MovetoElement")) {
			a.moveToElement(element).build().perform();
		}

		else if (action.equalsIgnoreCase("DoubleClick")) {
			a.doubleClick(element).build().perform();

		}
	}

	public static void iframes(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void ToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void RobotActions(String action) throws AWTException {
		Robot b = new Robot();
		if (action.equalsIgnoreCase("ToEnter")) {
			b.keyPress(KeyEvent.VK_ENTER);
			b.keyRelease(KeyEvent.VK_ENTER);
		} else if (action.equalsIgnoreCase("ToDown")) {
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public static void WindowHandle() {
		String id = driver.getWindowHandle();
		System.out.println(id);
	}

	public static void WindowHandles() {
		Set<String> set = driver.getWindowHandles();
		for (String id : set) {
			System.out.println(id);
		}
	}

	public static void GetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void GetCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void GetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void GetAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

	public static void clickonElement(WebElement element) {
		element.click();
	}

	public static void sentvalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select a = new Select(element);
		if (type.equalsIgnoreCase("Byvalue")) {
			a.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByvisibleText")) {
			a.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("Byindex")) {
			int index = Integer.parseInt(value);
			a.selectByIndex(index);
		}
	}

	public static void getoptions(WebElement element) {
		Select a = new Select(element);
		List<WebElement> options = a.getOptions();
		for (WebElement webElement : options) {
			System.out.println("\n" + webElement.getText());
		}
	}

	public static void getallSelectedoptions(WebElement element) {
		Select a = new Select(element);
		List<WebElement> options = a.getAllSelectedOptions();
		for (WebElement webElement : options) {
			System.out.println("\n" + webElement.getText());
		}

	}

	public static void getfirstselectedoptions(WebElement element) {
		Select a = new Select(element);
		WebElement aa = a.getFirstSelectedOption();
		System.out.println(aa.getText());
	}

	public static void ismultiple(WebElement element) {
		Select a = new Select(element);
		boolean boo = a.isMultiple();
		System.out.println("\n" + boo);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {

		driver.quit();
	}

	public static void Takescreenshot(String pic) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Baskar\\eclipse-workspace\\AdactinCucumber\\Screenshots" + pic + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void Isenable(WebElement element) {
		boolean is = element.isEnabled();
		System.out.println(is);
	}

	public static void Isdisplayed(WebElement element) {
		boolean is = element.isDisplayed();
		System.out.println(is);
	}

	public static void Isselected(WebElement element) {
		boolean is = element.isSelected();
		System.out.println(is);
	}

	public static void Radiobutton(WebElement element) {
		element.click();
	}

	public static void ScrollonElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void Scroll(String scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll);
	}

		public static String read_particular_data(String path,int row_index,int cell_index) throws IOException {
			File f=new File(path);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(0);
			Row row = sheetAt.getRow(row_index);
			Cell cell = row.getCell(cell_index);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				value = cell.getStringCellValue();
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double data = cell.getNumericCellValue();
				
				value=String.valueOf(data);
			}
						return value;
		}
}
