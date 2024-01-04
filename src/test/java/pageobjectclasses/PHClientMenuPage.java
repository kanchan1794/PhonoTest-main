package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHClientMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHClientMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewClientMenu() {

        WebElement ClientMenu_Link = driver.findElement(By.linkText("Clients"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Clients")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientMenu_Link);

   }

    public void ClickClientsListSubMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement ClientList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientList_Link);
    }

        public void ValidateClientListPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed() + "**********");
    }

    public void SearchClientRecord() throws InterruptedException {
        Thread.sleep(2000);
        WebElement ClientDropdown_List = driver.findElement(By.xpath("//select[@class='custom-select']"));
        Select dropdown = new Select(ClientDropdown_List);
       // ClientDropdown_List.click();
        dropdown.selectByValue("Active");
        Thread.sleep(2000);
        WebElement ClientSearchSubmit_BTN = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ClientSearchSubmit_BTN.click();

    }

    public void GoBack() {
        System.out.println("*************** Navigating Back Now ***************");
        driver.navigate().back();
        System.out.println("***************CurrentUrl***************:-" + driver.getCurrentUrl());
    }


}