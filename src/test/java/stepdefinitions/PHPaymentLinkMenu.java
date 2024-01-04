package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHPaymentLinkMenuPage;
import pageobjectclasses.PHTransactionMenuPage;

public class PHPaymentLinkMenu extends PHBrowserConfig {

    PHPaymentLinkMenuPage ObjPHPLMPage = new PHPaymentLinkMenuPage(driverThread.get());

    @When("Admin clicks on PaymentLink menu")
    public void adminClicksOnTransactionMenu() {
        ObjPHPLMPage.ViewPaymentLinkMenu();
        System.out.println("ADMIN CAN CLICK ON PaymentLink MENU");
    }

    @Then("Admin can see PaymentLink Submenu list and create")
    public void adminCanSeePaymentLinkDetails() {
        System.out.println("ADMIN CAN SEE PAYMENTLINK SUBMENU LIST AND CREATE");
    }

    @When("Admin clicks on PaymentLink-List submenu")
    public void adminClicksOnPaymentLinkListSubmenu() {
        ObjPHPLMPage.ClickPaymentListSubMenu();
        System.out.println("ADMIN CAN CLICK ON PAYMENT_LINK LIST SUBMENU");
    }

    @Then("Admin can see The details of list of PaymentLinks")
    public void adminCanSeeTheDetailsOfListOfPaymentLinks() {
        System.out.println("ADMIN CAN SEE THE DETAILS OF LIST OF PAYMENTSLINKS");

    }

    @And("Admin Can Check the Working Of Scorll Bar Functionality")
    public void adminCanSeeTheWorkingOfScorllBarFunctionality() throws InterruptedException {
        ObjPHPLMPage.PaymentLinkScrollBarFunction();
        System.out.println("ADMIN CAN CHECK THE WORKING OF SCROLL BAR FUNCTIONALITY");


    }
}
