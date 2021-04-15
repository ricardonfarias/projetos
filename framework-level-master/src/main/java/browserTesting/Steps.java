package browserTesting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import util.Funcoes;

//pagina principal para execucao dos testes fica mais limpa sem código de interação com os elementos
public class Steps {
    private static WebDriver driver;
    private HomePage homePage = new HomePage(driver);
    String type = "Regular";
    String support = "Basic";
    String duration = "1";
    Double price = 24.99;


    @Given("I open Chrome and launch the application")
    public void openChromeAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\89\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage.carregarPaginaInicial();
    }

    @When("I select type")
    public void selectType() {
        homePage.selecionarOpcaoType(type);
    }

    @When("I select support plan")
    public void selectSupportPlan(){
        homePage.selecionarOpcaoSupport(support);
    }

    @When("I write monthly duration of")
    public void writeMonthlyDuration () {
        homePage.informarDuration(duration);
    }

    @When("I click in calculate price button")
    public void clickCalculatePriceButton(){
        homePage.clicarBotaoCalculate();
    }

    @Then("I validate price is")
    public void	validatePrice() throws InterruptedException {
        Thread.sleep(5*1000);
        Assert.assertEquals(price, Funcoes.removerCifraoDevolverDouble(homePage.obterPrice()));
    }

/*
    @Then("^I attach file \"(.*)\"$")
    public void	attachFile(String file) throws  {
        WebElement uploadElement = driver.findElement(By.id("attachment"));
        uploadElement.sendKeys(file);
    }
*/
}
