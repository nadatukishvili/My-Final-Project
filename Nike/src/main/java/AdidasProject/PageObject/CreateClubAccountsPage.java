package AdidasProject.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreateClubAccountsPage {
    public SelenideElement

            joinClubButton = $(".gl-cta__content",6),
            firstNameInput =$("#registration-firstname-field"),
            lastnameInput = $("#registration-lastname-field"),
            GenderButton = $(".gl-radio-input__label",1),
            emailInput = $("#registration-email-field"),
            passwordInput = $("#registration-password-field"),
            ageConfirmationButton = $(byName( "ageConfirmation" )),
            registerButton = $(".gl-cta--primary"),
            privacyButtonCheck = $(byText( "Please agree Terms and Conditions!" )),
            privacyButton = $(byName( "terms" ));
}
