package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHTransactionMenuPage extends PHBrowserConfig{
    private WebDriver driver = null;

    public PHTransactionMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }




    public void ViewTransactionMenu() {

        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TransactionMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/transactions']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TransactionMenu_Link);

    }//super(driver);
    public void ValidateTransactionPage() throws InterruptedException {
        //VALIDATE LOGIN TEXT ON PAGE
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
    }
    public void SearchTransactionrecords()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchTransactionrecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchTransactionrecord);
        SearchTransactionrecord.sendKeys("Sandeep");

        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchTransactionrecord);

    }
    public void ValidateTransactionRecordsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed()+"**********");

    }
    public void ClickOnTransactionpageBreadCrumbs()
    {

        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        Wait.until((ExpectedConditions.visibilityOfElementLocated((By.linkText("5")))));
        WebElement TraPageBreadCrumbs_Link = driver.findElement(By.linkText("5"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TraPageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TraPageBreadCrumbs_Link);

    }

    public void ValidateTRanSearchPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed() + "**********");
        Thread.sleep(2000);

    }
    public void GOPreviousPage() throws InterruptedException {
        WebElement GoBackTrPage = driver.findElement(By.linkText("1"));
        GoBackTrPage.click();
        Thread.sleep(2000);
       ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
       // JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])")));
driver.navigate().back();


//        WebElement TRScrollUP = driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])"));
//
////TRScrollUP.isDisplayed();


    }
    public void VerifyTransactionListScrollVertical() throws InterruptedException {
        Thread.sleep(4000);
        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
        TransactionMenu_Link.click();
        //Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");
    }

    public void VerifyTransactionListScrollHorizantal() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");


    }




}
