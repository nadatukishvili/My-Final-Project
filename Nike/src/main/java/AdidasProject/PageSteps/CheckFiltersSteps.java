package AdidasProject.PageSteps;

import AdidasProject.PageObject.CheckFilterPages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.*;


public class CheckFiltersSteps extends CheckFilterPages {
    @Step("click women Page")

    public CheckFiltersSteps gotoWomenPage() {
        womanPage.click();
        return this;
    }

    @Step("close modal window")
    public CheckFiltersSteps closeModalWindow() {
        informationButton.click();
        return this;
    }

    @Step("scroll down")
    public CheckFiltersSteps scrollDown() {
        scroll.scrollIntoView( "true" );
        return this;
    }

    @Step("Add page filter")
    public CheckFiltersSteps sortByValues() {
        dropDown.click();
        priceFilter.click();
        return this;

    }

    @Step("add filter by values")
    public CheckFiltersSteps addShoesFilter() {
        shoesPage.click();
        return this;
    }

    @Step("check page's filter")
    public CheckFiltersSteps check_Filter() {
        filterCheck.shouldBe( Condition.visible );
        return this;
    }

    @Step("clear Filter")
    public CheckFiltersSteps clear_Filter() {
        filterCheck.click();
        return this;
    }

    @Step("recheck filter")
    public CheckFiltersSteps recheck_Filter() {
        filterCheck.shouldNotBe( Condition.visible );
        return this;
    }

    @Step("check result of sortied elements")
    public CheckFiltersSteps checkSortiedElement() {

        ElementsCollection elements = $$( ".gl-price" );

        for (int i = 0; i < elements.size(); i++) {
            System.out.println( elements.get( i ).getText() );
            String value = elements.get( i ).getText();
            String newValue = value.substring( 1, value.length() );
            int j = Integer.parseInt( newValue );
            System.out.println( j );

            System.out.println( newValue + "+" );
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
@Step("search product category")
    public CheckFiltersSteps searchProductCategory() {
        searchButton.setValue( "sneakers" ).pressEnter();
        return this;
    }


}




