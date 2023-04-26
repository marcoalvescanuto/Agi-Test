package com.webautomation.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://blogdoagi.com.br")
public class LupaPesquisarPage extends PageObject {

    @FindBy(id = "search-open")
    private WebElementFacade lupaPesquisa;
    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade pesquisarPor;
    @FindBy(css = "input.search-submit[type='submit'][value='Pesquisar']")
    private WebElementFacade botaoPesquisar;

    @FindBy(id = "primary")
    private WebElementFacade resultadosPesquisa;
    @FindBy(xpath = "//h1[contains(text(),'Nenhum resultado')]")
    private WebElementFacade resultadoPesquisaErro;
    @FindBy(xpath = "//h1[contains(text(),'Resultados da busca por:')]")
    private WebElementFacade resultadoPesquisaNaoPreenchido;
    @FindBy(xpath = "//a[@class='page-numbers' and contains(text(), '2')]")
    private WebElementFacade botaoProximaPagina;

    @FindBy(xpath = "//h2[contains(@class, 'entry-title')]")
    private WebElementFacade linkDaPesquisa;

    public void clicarLupaPesquisa() {
        lupaPesquisa.click();
    }

    public boolean getVisualizarElementosPesquisar() throws Exception {
        return pesquisarPor.isVisible()
                && botaoPesquisar.isVisible();
    }

    public void preencherEClicarBtnPesquisar(String texto) {
        pesquisarPor.sendKeys(texto);
        botaoPesquisar.click();
    }

    public boolean getVisualizarResultadoDaPesquisa() throws Exception {
        return resultadosPesquisa.isVisible();
    }

    public boolean getVisualizarResultadoDaPesquisaErro() throws Exception {
        return resultadoPesquisaErro.isVisible();
    }

    public void naoPreencherEClicarBtnPesquisar() {
        botaoPesquisar.click();
    }

    public boolean getVisualizarResultadoDaPesquisaNaoPreenchido() throws Exception {
        return resultadoPesquisaNaoPreenchido.isVisible();
    }

    public boolean getBotaoProximaPagina() throws Exception {
        return botaoProximaPagina.isVisible();

    }

    public void clicarBotaoProximaPagina(PageObject driver) {
        final WebElement botaoProximaPagina = getDriver()
                .findElement(By.xpath("//a[@class='page-numbers' and contains(text(), '2')]"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", botaoProximaPagina);
    }

    public boolean validarElementoAleatorioVisivel() {
        List<org.openqa.selenium.By> seletoresElementos = Arrays.asList(
                By.xpath("//h2[contains(@class, 'entry-title')]"),
                By.xpath("//div[contains(@class, 'entry-summary')]"));
        return seletoresElementos.stream().anyMatch(seletor -> find(seletor).isVisible());
    }

    public boolean getVisualizarResultadoDaPesquisaCaractresEspeciais() throws Exception {
        return resultadoPesquisaErro.isVisible();
    }

    public boolean getvisualizarResultadoDaPesquisaComEspacos() throws Exception {
        return resultadoPesquisaErro.isVisible();
    }

    public void clicarLinkDaPesquisa() {
        linkDaPesquisa.click();
    }
}