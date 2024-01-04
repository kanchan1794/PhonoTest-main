package pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHPaymentLinkMenuPage {
    private WebDriver driver = null;

    public PHPaymentLinkMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewPaymentLinkMenu()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Payments Link")));
        WebElement PaymentLinkMenu_Link = driver.findElement(By.linkText("Payments Link"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLinkMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLinkMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PaymentLinkMenu_Link);

    }

    public void ClickPaymentListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement PaymentList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PaymentList_Link);


//        driver.findElement(By.linkText("List")).click();
//        driver.findElement(By.xpath("//input[@placeholder='45 records...']")).sendKeys("Delayed Speech");
//        System.out.println("------Admin Can See Search Record Under Delayed Speech Specalities------");

    }

    public void PaymentLinkScrollBarFunction() throws InterruptedException {
        Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Developed by Cling Multi Solutions Pvt Ltd')]")));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=500");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        //WebElement PaymentLink_ScrollFun = driver.findElement(By.xpath("//a[contains(text(),'Developed by Cling Multi Solutions Pvt Ltd')]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLink_ScrollFun);
//       Thread.sleep(2000);
//        ((JavascriptExecutor) driver)
//                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

    }
    }
