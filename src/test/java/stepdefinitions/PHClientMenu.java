package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHClientMenuPage;
import pageobjectclasses.PHLeadMenuPage;

public class PHClientMenu extends PHBrowserConfig {

    PHClientMenuPage ObjPHCLMBPage = new PHClientMenuPage(driverThread.get());

    @When("Admin clicks on Client menu")
    public void adminClicksOnClientMenu() {
        ObjPHCLMBPage.ViewClientMenu();
        System.out.println("ADMIN CLICK ON CLIENT MENU");
    }

    @Then("Admin can see Clients List and add submenu List")
    public void adminCanSeeClientListSection() throws InterruptedException {
        System.out.println("ADMIN CAN SEE CLIENTS LIST AND ADD SUBMENU ");
    }

    @When("Admin clicks on Clients List submenu")
    public void adminClicksOnClientsListSubmenu() {
        ObjPHCLMBPage.ClickClientsListSubMenu();
        System.out.println("ADMIN CLICKS ON CLIENT'S LIST MENU ");
            }

    @Then("Admin can see The details of list of Clients")
    public void adminCanSeeTheDetailsOfListOfClients() throws InterruptedException {
        ObjPHCLMBPage.ValidateClientListPage();
        System.out.println("ADMIN CAN SEE LIST OF CLIENTS HERE");
    }

    @When("Admin Enters Search Keywords for Clients")
    public void adminEntersSearchKeywordsForClients() throws InterruptedException {
        ObjPHCLMBPage.SearchClientRecord();
        System.out.println("ADMIN CAN ENTER KEYWORD TO SEARCH THE CLIENT RECORDS HERE -ACTIVE");
        ObjPHCLMBPage.ValidateClientListPage();
    }

    @Then("Relevant Clients Search Results Generated")
    public void relevantClientsSearchResultsGenerated() throws InterruptedException {
        ObjPHCLMBPage.ValidateClientListPage();
        System.out.println("------ADMIN CAN SEE RELEVANT CLIENTS SEARCH RESULTS------");
    }
}
