package AdidasProject.Utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ChromeRunner {
    @BeforeTest
    public void openBrowser(){
        com.codeborne.selenide.Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "Files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open( "https://www.adidas.com/us");
        $(byText( "POPULAR RIGHT NOW" )).scrollIntoView( "true" );
        //$(byText( "EVERY KM COUNTS SO JOIN NOW" )).waitUntil( Condition.visible,10000 );
        Assert.assertEquals( "POPULAR RIGHT NOW" ,$(byText( "POPULAR RIGHT NOW" )).getText(),"check text");

    }
}
