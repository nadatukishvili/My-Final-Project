package AdidasProject.PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckFilterPages {
    public SelenideElement

            womanPage = $(".main-menu___1xu8m").$(byText( "Women" )),
            informationButton = $(".gl-modal__close").$(".gl-icon"),
            scroll = $(".title-bar___MSmAB"),
            shoesPage = $(".gl-label--l",1),
            // shoesPage = $(".subnav___3oPbN"),
            dropDown = $(".gl-dropdown-custom--no-max-height").$(".dropdown-select"),
            priceFilter = $(".gl-dropdown-custom__options"),
            filterCheck = $(".filter_item_wrap___eSB8k",1),
            searchButton = $(byName( "q" ));

   public
    ElementsCollection elements = $$( ".gl-price" );

}
