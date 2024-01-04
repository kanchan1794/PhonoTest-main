package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/featurefiles"},
        glue = {"stepdefinitions"},
        plugin = {"json:target/cucumber.json"},
		//tags = "@Login or @PartnersMenu"
       //tags ="@Login or @PartnersMenu or @PartnersListSubMenu or @PartnersListTableScrollDown "
       //  tags ="@Login or @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown"
tags="@Login or   @PaymentLinkMenu or   @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom"
//tags ="  @Login or @TherapistMenu or @TherapistListSubMenu or @TherapistShowCredentials or  @TherapistViewDetails or @PageBreadCrumbs or @TherapistListTableScrollDown or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown or @ClientMenu or   @LeadMenu or   @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown "
//tags ="@Login or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown"
		//or @TherapistListSubMenu or @TherapistExcelFileDownload or @PageBreadCrumbs or @TherapistListTableScrollDown or @TherapistShowCredentials or @TherapistViewDetails or
// or @TherapistAddSubMenu  or @Dashboard


)

public class TestRunner {

}
