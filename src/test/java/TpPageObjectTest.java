package test.java;
import main.java.amazon.CartPage;
import main.java.amazon.HomePage;
import main.java.amazon.ProductPage;
import main.java.amazon.SearchResultPage;
import main.java.commun.SetupTeardown;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TpPageObjectTest extends SetupTeardown {
    final String expectedTaille  = "256Go";
    final String expectedCouleur  = "Vert alpin";
    final String expectedConfiguration  = "Sans AppleCare+";
    final String expectedTotale  = "Sous-total (2 articles):";





    @Test
    public void testPO() {
        String keyword = "Apple iPhone 13 Pro Max (256 Go) - Vert Alpin";
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookie();
        homePage.searchWithButton(keyword);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.openSearchResult(0);
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCard();
        productPage.refuseAppleCare();
        productPage.openCard();

        //CartPage cartPage = new CartPage(driver);
       //cartPage.selectQuantity();
       //cartPage.getFirstProductCapacity();



        // ***********************************Asserts*********************//
      // Assert.assertEquals(cartPage.getFirstProductCapacity(), expectedTaille, "Taille pas bon");
       //// Assert.assertEquals(cartPage.getFirstProductConfiguration(), expectedConfiguration, "config pas bon");
       // Assert.assertEquals(cartPage.getSubtotalCart(), expectedTotale, "sous total pas bon");

    }

        }

