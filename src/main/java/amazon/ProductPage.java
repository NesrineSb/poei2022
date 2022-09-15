package main.java.amazon;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    private WebDriver driver;

    private By refuseAppleCareSelector = By.cssSelector("[aria-labelledby='attachSiNoCoverage-announce']");
    private By openCardSelector = By.cssSelector("#attach-sidesheet-view-cart-button");
    private By ajouterAuPanierButtonSelector=By.cssSelector("[aria-labelledby='submit.add-to-cart-announce']");

    private final int TIMEOUT= 6;
    private static final Logger log= LogManager.getLogger(HomePage.class);

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //click ajouter au panier button
    public void addToCard(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        WebElement ajouterAuPanierButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ajouterAuPanierButtonSelector));
        ajouterAuPanierButton.click();

    }


    public void refuseAppleCare(){
        log.info("refuser apple care");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        WebElement nonmerci = wait.until(ExpectedConditions.visibilityOfElementLocated(refuseAppleCareSelector));
        nonmerci.click();

    }
    //click cart button
    public void openCard(){
        log.info("ouvrir card");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        WebElement panierButton = wait.until(ExpectedConditions.visibilityOfElementLocated(openCardSelector));
        panierButton.click();

    }
}
