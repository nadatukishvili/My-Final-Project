package AdidasProject.PageSteps;

import AdidasProject.PageObject.LoginPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class LoginPagesSteps extends LoginPage {

    @Step("open Log In page")
    public LoginPagesSteps gotoLogInPage(){
        loginButton.click();
        return  this;
    }
    @Step("check Log In page title")
    public LoginPagesSteps checkLoginPageTitle(){
        loginPageTitle.shouldBe( Condition.visible);
        return  this;
    }
    @Step ("LogIn name is - {name2}")
    public LoginPagesSteps login_name(String name2){
        logInNameInput.setValue( name2 ).waitUntil( Condition.visible,5000 ).pressEnter();
        return this;
    }
    @Step("LogIn password is - {password2}")
    public LoginPagesSteps login_Password(String password2){
        logInPasswordInput.setValue( password2 ).waitUntil( Condition.visible, 5000).pressEnter();
        return this;
    }
  /*@Step("click submit button")
    public LoginPagesSteps submit(){
        submitButton.pressEnter();
        return this;
    }*/

    @Step("Close Info modal window")
    public LoginPagesSteps closeInfoWindow(){
        buttonInfo.pressEnter();
        return this;
    }
    @Step("scroll down")
    public LoginPagesSteps scroll(){
        scrollText.scrollIntoView( "true" );
        return this;

    }
    @Step("check shopping bag")
    public LoginPagesSteps goToShoppingBag(){
        shoppingBag.click();
        return this;

    }
    @Step("sleep")
    public LoginPagesSteps sleepCheck(){
        shoppingBag.waitUntil( Condition.visible,3000 );
        return this;

    }
    @Step("check product visibility")
    public LoginPagesSteps checkProductTotal(){
        productCheck.shouldNotBe( Condition.visible );
        return this;
    }
    @Step("go to LogOut Page")
    public LoginPagesSteps goToLogOutPage(){
        logoutPage.click();
        return this;
    }
    @Step("click Logout Button")
    public LoginPagesSteps logout(){
        logoutButton.click();
        return this;
    }
    @Step ("check sortied products")
    public LoginPagesSteps sortiedValue() {
        ElementsCollection elements = $$( ".gl-price" );
        for (int i = 0; i < elements.size(); i++) {
            System.out.println( elements.get( i ).getText() );
            String value = elements.get( i ).getText();
            String newValue = value.substring( 1, value.length() );
            int j = Integer.parseInt( newValue );
            System.out.println( j );

            System.out.println( newValue + "++" );
            String SecondValue = elements.get( i++ ).getText();
            String newSecondValue = SecondValue.substring( 1, value.length() );

            int n = Integer.parseInt( newSecondValue );
            System.out.println( value );
            if (j <= n) {
                System.out.println( "good" );

            } else {
                System.out.println( "try again" );

            }

        }

return this;
    }

}
