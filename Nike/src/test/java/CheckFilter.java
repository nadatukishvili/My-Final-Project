import AdidasProject.PageSteps.CheckFiltersSteps;
import AdidasProject.Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selenide.*;
@Listeners(AdidasProject.Utils.TestLister.class)

public class CheckFilter extends ChromeRunner {
    @Test
    @Description("add/remove filter")

    public void filter_check() {


        CheckFiltersSteps filterSteps = new CheckFiltersSteps();
        filterSteps
                .gotoWomenPage();
        String pageResult = "women".toUpperCase();
        Assert.assertEquals( filterSteps.womanPage.getText(), pageResult, "check page" );
        filterSteps
                .closeModalWindow()
                .scrollDown()
                .addShoesFilter()
                .check_Filter()
                .clear_Filter()
                .recheck_Filter();

    }

    @Test
    @Description("check all sortied items")
    public void sortItems() throws InterruptedException {
        CheckFiltersSteps filtersSteps = new CheckFiltersSteps();
        filtersSteps
                .sortByValues()
                .checkSortiedElement()
                .searchProductCategory();
                 sleep( 5000 );

    }



}