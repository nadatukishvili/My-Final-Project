import AdidasProject.PageSteps.LoginPagesSteps;
import AdidasProject.Utils.ChromeRunner;
import AdidasProject.Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static AdidasProject.DataObject.AdidasObject.loginEmail;
import static AdidasProject.DataObject.AdidasObject.loginPassword;
import static com.codeborne.selenide.Selenide.*;

@Listeners(AdidasProject.Utils.TestLister.class)
public class LogInPage extends ChromeRunner {
    @BeforeTest
    @Description("logIn")
    public void openLogInPage(){
        LoginPagesSteps steps = new LoginPagesSteps();
        steps
                .gotoLogInPage()
                .checkLoginPageTitle();
        Assert.assertEquals( "LOG IN" , steps.loginPageTitle.getText(), "check title");
        steps
                .login_name( loginEmail );
        Assert.assertEquals( loginEmail, steps.logInNameInput.getValue(), "check logIn name" );
        steps
                .login_Password( loginPassword );
        Assert.assertEquals(loginPassword, steps.logInPasswordInput.getValue(),"check Password" );

        steps
                //.submit()
                .closeInfoWindow();

                        sleep(5000);

    }

    @Test
    @Description("check shopping bag info")
    public void shoppingBag(){
        LoginPagesSteps newSteps = new LoginPagesSteps();
        newSteps
                .scroll()
                .goToShoppingBag()
                .sleepCheck();
                //Assert.assertEquals( "TOTAL: (1 item) ",newSteps.shoppingBag.getText() );
                newSteps.checkProductTotal();

    }

    @Test
    @Description("Sign out")
    public void logOut(){
        LoginPagesSteps step = new LoginPagesSteps();
        step
                .goToLogOutPage()
                .logout();

    }





}
