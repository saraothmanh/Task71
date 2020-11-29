import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ecommerceT extends ecommerce {
    @Test()

    public void test () throws Exception
    {
       SetupChromedriver();

       registration();
        AddToCart();
        Checkout();
        driver.manage().timeouts().implicitlyWait(80L, TimeUnit.SECONDS);
        loginIN();
        driver.manage().timeouts().implicitlyWait(120L, TimeUnit.SECONDS);
         driver.quit();   ;


    }


}
