package test.java;
import main.java.amazon.HomePage;
import main.java.commun.SetupTeardown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TpTestHover extends SetupTeardown {
        final String expectedTaille  = "256Go";
        final String expectedCouleur  = "Vert alpin";
        final String expectedConfiguration  = "Sans AppleCare+";
        final String expectedTotale  = "Sous-total (2 articles):";


        @Test
        public void test2() {

            HomePage homePage= new HomePage(driver);
            WebElement loginButton = driver.findElement(By.cssSelector("#nav-link-accountList"));

            Actions actions = new Actions(driver);
            actions.moveToElement(loginButton);
            actions.perform();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }



    }
