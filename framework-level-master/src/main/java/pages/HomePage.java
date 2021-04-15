package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

//criação da classe page para usar o conceito de pageObjects e realizar todas as iterações com os elementos da página nessa classe

public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
//separação da localização do elemento na página para facilitar a manutenção, caso haja alguma alteração
    private By type = By.id("type");
    private By support = By.id("support");
    private By duration = By.id("duration");
    private By calculate = By.id("calculate");
    private By price = By.id("price");


    public void carregarPaginaInicial() {
        driver.get("https://qa-automation-challenge.github.io/sandbox/#");
    }

    public Select encontrarSelectType(){
        return new Select(driver.findElement(type));
    }

    public void selecionarOpcaoType(String opcao){
        encontrarSelectType().selectByVisibleText(opcao);
    }

    public Select encontrarSelectSupport(){
        return new Select(driver.findElement(support));
    }

    public void selecionarOpcaoSupport(String opcao){
        encontrarSelectSupport().selectByVisibleText(opcao);
    }

    public void informarDuration(String valor){
        driver.findElement(duration).sendKeys(valor);
    }

    public void clicarBotaoCalculate(){
        driver.findElement(calculate).click();
    }

    public String obterPrice(){
        return driver.findElement(price).getText();
    }




}
