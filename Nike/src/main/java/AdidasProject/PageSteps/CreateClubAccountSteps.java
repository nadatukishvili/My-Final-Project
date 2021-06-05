package AdidasProject.PageSteps;

import AdidasProject.PageObject.CreateClubAccountsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;

import static AdidasProject.DataObject.AdidasObject.password;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateClubAccountSteps extends CreateClubAccountsPage {
    @Step("join adidas club")
    public CreateClubAccountSteps joinToTheClub(){
        joinClubButton.click();
        return this;
    }
    @Step("Club Account Name is - {Name}")
    public CreateClubAccountSteps first_Name(String Name){
        firstNameInput.setValue( Name ).pressEnter();
        return this;
    }
    @Step("Club Account Last Name is - {name2}")
    public CreateClubAccountSteps last_Name(String name2){
        lastnameInput.setValue( name2 ).pressEnter();
        return this;
    }
    @Step("Club Account Email is - {emailAddress}")
    public CreateClubAccountSteps email_Address(String emailAddress){
        emailInput.setValue( emailAddress ).pressEnter();
        return this;
    }
    @Step("click Gender Button")
    public CreateClubAccountSteps setGender(){
        GenderButton.click();
        System.out.println(GenderButton.isSelected());
        return this;
    }
    @Step("Club Account Password is - {password1}")
    public CreateClubAccountSteps password_Input(String password1){
        passwordInput.setValue( password1 ).pressEnter();
        return this;
    }
    @Step(" click Age Confirmation button")
    public CreateClubAccountSteps setAgeConfirmation(){
        ageConfirmationButton.click();
        return this;
    }
    @Step("PressEnter submit button")
    public CreateClubAccountSteps pressRegisterButton(){
        registerButton.pressEnter();
        return this;
    }
    @Step("check privacy button")
    public CreateClubAccountSteps privacy_Button_Check(){
        privacyButtonCheck.shouldBe( Condition.visible );
        return this;

    }
    @Step("click privacy button")
    public CreateClubAccountSteps setPrivacyButton(){
        privacyButton.click();
        return this;
    }
    @Step("check password logic ")
    public CreateClubAccountSteps checkPassword() throws IOException, BiffException {
        String FilePath = "Files/Password Result.xls";
        FileInputStream fs = new FileInputStream( FilePath );
        Workbook wb = Workbook.getWorkbook( fs );
        Sheet sheet1 = wb.getSheet( "Sheet1" );
        int totalNoOfRows = sheet1.getRows();
        for (int row = 0; row < totalNoOfRows; row++) {
            String passwordValue = sheet1.getCell( 0, row ).getContents();
            System.out.println( sheet1.getCell( 0, row ).getContents() );
            if (passwordValue.equals( password )) {
                password_Input(password);
            } else
                System.out.println( "Please use 8 or more characters, with at least 1 number and a mixture of uppercase and lowercase letters" );
            sleep( 5000 );
        }
        return this;
    }


}
