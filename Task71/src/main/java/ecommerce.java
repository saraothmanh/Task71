import javafx.scene.web.WebEngine;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ecommerce {
    public static String URL = "http://automationpractice.com";
    public static WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor)driver;


    public static void SetupChromedriver()
    {


            System.setProperty("webdriver.chrome.driver", "/Users/saraothman/Downloads/chromedriver2");
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.navigate().to(URL);

    }
    public  void registration()
    {

      WebElement SignIn;
        SignIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        SignIn.sendKeys(Keys.ENTER);;


        WebElement mail = driver.findElement(By.xpath("//input[@id='email_create']"));
        mail.sendKeys("saraothman7777@gmail.com");

        WebElement clickCreate = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"));
        clickCreate.click();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);

        WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        gender.click();


        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys("Sara");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys("Othman");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("12345S");

        Select days = new Select(driver.findElement(By.id("days")));
        days.selectByIndex(23);

        Select months = new Select(driver.findElement(By.id("months")));
        months.selectByIndex(7);

        Select years = new Select(driver.findElement(By.name("years")));
        years.selectByIndex(26);




        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("vodafone");

        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("Maadi");

        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("C4");
        //js.executeScript("window.scrollBy(0,300)");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("cairo");

        Select state = new Select(driver.findElement(By.name("id_state")));
        state.selectByIndex(5);

        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys("16333");

        Select country = new Select(driver.findElement(By.name("id_country")));
        country.selectByIndex(1);


        WebElement additionalinfo = driver.findElement(By.id("other"));
        additionalinfo.sendKeys("01000723426");

        WebElement homephone = driver.findElement(By.id("phone"));
        homephone.sendKeys("02222");


        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("01000723426");

        WebElement alias = driver.findElement(By.id("alias"));
        alias.sendKeys("abc");
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        WebElement register = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
        register.click();

        WebElement home = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
        home.click();


    }
    public void AddToCart() throws InterruptedException {

        WebElement item1 = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][@title='Printed Dress']"));
        item1.click();
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);



        WebElement frame = driver.findElement(By.xpath("//*[@class='fancybox-inner']//*[@class='fancybox-iframe']"));
        driver.switchTo().frame(frame);


        //driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().perform();



        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    }
    public void Checkout()
    {
        driver.switchTo().defaultContent();

        WebElement proceedToCheckout1 =
                driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));
        proceedToCheckout1.click();

        WebElement BasketCheckout =
                driver.findElement(By.xpath("//*[@class='cart_navigation clearfix']//*[@title='Proceed to checkout']"));
        BasketCheckout.click();

        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);


        WebElement proceesAddress= driver.findElement(By.name("processAddress"));
        proceesAddress.click();

        WebElement Checkbox = driver.findElement(By.xpath("//*[@id='cgv']"));
        Checkbox.click();

        WebElement processCarrier = driver.findElement(By.name("processCarrier"));
        processCarrier.click();

        WebElement payment = driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
        payment.click();

        WebElement confirm = driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));
        confirm.click();

        //Sign OUT

        WebElement SignOut = driver.findElement(By.className("logout"));
        SignOut.click();

    }
    public static void loginIN() {


        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("Saraothmanh@gmail.com");

        WebElement Password = driver.findElement(By.name("passwd"));
        Password.sendKeys("12345S");
        WebElement SignInB = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));
        SignInB.click();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);

    }



}
