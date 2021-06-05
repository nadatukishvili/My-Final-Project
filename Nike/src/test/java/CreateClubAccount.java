import AdidasProject.PageSteps.CreateClubAccountSteps;
import AdidasProject.PageSteps.LoginPagesSteps;
import AdidasProject.Utils.ChromeRunner;
import io.qameta.allure.Description;
import jxl.read.biff.BiffException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import static AdidasProject.DataObject.AdidasObject.*;


import static com.codeborne.selenide.Selenide.*;
@Listeners(AdidasProject.Utils.TestLister.class)

public class CreateClubAccount extends ChromeRunner {
    @Test
    @Description("club registration")
    public void test() throws IOException, BiffException {
        LoginPagesSteps st = new LoginPagesSteps();

        st.gotoLogInPage()
        .checkLoginPageTitle();

        CreateClubAccountSteps step = new CreateClubAccountSteps();
        step
                .joinToTheClub()
                .first_Name( firstName );
         Assert.assertEquals( firstName,step.firstNameInput.getValue(),"check name" );
        step.last_Name( lastName );
         Assert.assertEquals( lastName,step.lastnameInput.getValue(),"check lastName" );
        step.setGender();
        sleep( 10000 );

        step.email_Address( email );
                 Assert.assertEquals( email,step.emailInput.getValue() , "check emailAddress");
         step.checkPassword();
                 Assert.assertEquals( password,step.passwordInput.getValue(), "check password" );

         step.setAgeConfirmation();
                 Assert.assertTrue( step.ageConfirmationButton.isSelected() );

                 step.pressRegisterButton();

        step.privacy_Button_Check();
        Assert.assertFalse( step.privacyButton.isSelected() );

                 step.setPrivacyButton();
        Assert.assertTrue( step.privacyButton.isSelected() );
        sleep( 3000 );


    }
}






