package Pages;

import com.microsoft.playwright.Page;

public class CartPage extends HomePage{
    private final Page page;

    String placeOrderButton="//button[@class='btn btn-success']";
    String NameField="//input[@id='name']";
    String CountryField="//input[@id='country']";
    String CityField="//input[@id='city']";
    String CreditCard="//input[@id='card']";
    String MonthField="//input[@id='month']";
    String YearField="//input[@id='year']";

    String PurhcaseButton="(//button[@class='btn btn-primary'])[3]";

    String OkButton="//button[@class='confirm btn btn-lg btn-primary']";


    public CartPage(Page page) {
        super(page);
        this.page = page;
}

public void orderComplete(String NameFielD, String CountryFielD,String CityFielD,String CreditCarD,String MonthFielD,String YearFielD ) {
    page.click(placeOrderButton);
    page.fill(NameField, NameFielD);
    page.fill(CountryField, CountryFielD);
    page.fill(CityField, CityFielD);
    page.fill(CreditCard, CreditCarD);
    page.fill(MonthField, MonthFielD);
    page.fill(YearField, YearFielD);
}
public void Confirm(){
        page.click(PurhcaseButton);
}

public void ClickOnOk(){
    page.click(OkButton);

}
}
