package AdidasProject.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
public SelenideElement

        loginButton =$(".inner___1T3DW").$(byText( "Log in" )),
        loginPageTitle =$(".offset-l-1").$(byText( "Log in" )),
        logInNameInput = $("#login-email"),
        logInPasswordInput = $(".gl-input",1).$("#login-password"),
        //buttonInfo = $(".gl-cta--tertiary",4).$(byText( "CLOSE THIS MESSAGE" )),
        //buttonInfo = $(".gl-modal__main-content").$( byText( "CLOSE THIS MESSAGE" ) ),
        //buttonInfo=$(byXpath( "//*[@id=\"modal-root\"]/div/div/div/div[2]/div/button/span" )),
        //submitButton = $(".gl-vspace-bpall-small",1).$(byText( "Log in "),
        buttonInfo = $(".gl-modal__close"),
        //buttonInfo = $(".gl-modal__dialog--small").$( byText( "CLOSE THIS MESSAGE" ) ),
        //buttonInfo = $(".text-container___1d5ex").$(byText( "CLOSE THIS MESSAGE" )),
        //buttonInfo = $(byXpath( "//*[@id=\"close\"]/path" )),
        //scrollText = $(".gl-modal__main").$(byText( "in my shopping bag" )),
        scrollText = $(byText( "Your vouchers" )),
        shoppingBag = $(".gl-icon",9),
        productCheck =$(byText( "TOTAL: (1 item) " )),
        logoutPage = $(byText( "Welcome back Natia" )),
        logoutButton= $(byText( "Log out" )),
        submitButton = $(".gl-cta__content",2);























}

