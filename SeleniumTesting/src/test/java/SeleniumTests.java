import static org.junit.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTests {

	WebDriver driver;
	Actions action;
	List<String> xpaths;
	int index;
	List<WebElement> webEleList;
	List<Integer> ints;
	int maxValue;
	int minValue;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ahren\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		action = new Actions(driver);
	}

	@Ignore
	@Test
	public void testTwo() {
		driver.get("https://www.google.com");
		WebElement webele = driver
				.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		webele.sendKeys("Halloween");
		WebElement submit = driver
				.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"));

		submit.submit();
		WebElement resultPage = driver.findElement(By.xpath(
				"/html/body/div[7]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div/div/span/div/div/div/div[2]"));
		assertEquals("xyz", resultPage.getText().equals("31 October"), true);
	}

	@Test
	@Ignore
	public void theDemoSiteTest() {
		driver.get("http://thedemosite.co.uk/");
		WebElement addUser = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		addUser.click();
		WebElement testUsn = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		testUsn.sendKeys("Soup");
		WebElement testPw = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		testPw.sendKeys("Pooy");
		WebElement submit = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		submit.submit();
		WebElement loginPage = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginPage.click();
		WebElement enterUsn = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		enterUsn.sendKeys("Soup");
		WebElement enterPw = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		enterPw.sendKeys("Pooy");
		WebElement login = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		login.submit();
		WebElement loginSuccess = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

		assertEquals("xyz", true, loginSuccess.getText().equals("**Successful Login**"));
	}

	@Test
	@Ignore
	public void shoppingWebsiteTest() {
		driver.get("http://automationpractice.com/index.php");
		WebElement searchPhrase = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		searchPhrase.sendKeys("dress");
		WebElement search = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		search.submit();
		WebElement searchResult = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
		assertEquals("fail", true, searchResult.getText().equals("Printed Summer Dress"));
	}

	public void waitFor(String xp) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xp)));
	}

	@Test
	@Ignore
	public void travelPHPTest() throws InterruptedException {
		driver.get("https://www.phptravels.net/");
		WebElement searchParams = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[1]/div/div[2]/div/a/span[1]"));
//		searchParams.waitFor();
		searchParams.sendKeys("London", Keys.TAB, "01-12-2019", Keys.TAB, "04-12-2019");
		WebElement adults = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span[3]/button[1]"));
		adults.click();
		WebElement enterSearch = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[4]/button"));
		enterSearch.submit();
		WebElement selectHotel = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div/section/div/div[2]/div/div/div[2]/ul/li[1]/div/div/div[2]/div/div[3]/div/div[2]/form/button"));
		selectHotel.click();
		WebElement seePriceAndDate = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div/div[2]/a"));
		seePriceAndDate.click();
		WebElement bookNow = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div/div[2]/a"));
		bookNow.click();
		WebElement formTitle = driver.findElement(
				By.xpath("/html/body/div/div[1]/div[1]/div/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[1]/select"));
		formTitle.click();
		formTitle.sendKeys(Keys.ENTER, Keys.TAB, "Fan", Keys.TAB, "Yi", Keys.TAB, "woo@woomail.com");
		WebElement formCountry = driver.findElement(
				By.xpath("/html/body/div/div[1]/div[1]/div/div[1]/div[2]/form/div[1]/div[2]/div[3]/div[1]/div/a/span"));
		formCountry.sendKeys(Keys.ENTER, Keys.TAB, "07696969696", Keys.TAB, "daddeh", Keys.TAB, "6969696969696969",
				Keys.TAB, Keys.TAB, Keys.TAB, "666");
		WebElement completeBooking = driver
				.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[1]/div[2]/form/button"));
		completeBooking.submit();
//		WebElement name = driver.findElement(By.xpath(""));
//		WebElement name = driver.findElement(By.xpath(""));
//		WebElement name = driver.findElement(By.xpath(""));
//		WebElement name = driver.findElement(By.xpath(""));
	}
	
//	@Test
//	public void writeName() {
//		driver.get("https://www.youidraw.com/apps/painter/");
//		action.moveByOffset(50, 150).clickAndHold().moveByOffset(0, -100).moveByOffset(xOffset, yOffset)
//	}
	
	@Test
	public void FTSETest() {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		webEleList = driver.findElements(By.id("perc"));
		ints = new ArrayList<Integer>();
		for (WebElement w : webEleList) {
			String x = w.toString().replace("%", "");
			int y = Integer.parseInt(x);
			ints.add(y);
		}
		maxValue = ints.stream().reduce(Math::max).get();
		minValue = ints.stream().reduce(Math::min).get();
		WebElement largestRiser = driver.findElement(By.name(maxValue + "%"));
		WebElement largestFaller = driver.findElement(By.name(minValue + "%"));
		System.out.println(largestRiser);
		System.out.println(largestFaller);
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
