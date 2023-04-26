package com.webautomation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://blogdoagi.com.br")
public class HomeAgiPage extends PageObject {

    @FindBy(id = "search-open")
    private WebElementFacade lupaPesquisa;
    @FindBy(xpath = "//*[@id='site-branding']/div/a/img")
    private WebElementFacade logoTelaBlogAgibank;
    @FindBy(xpath = "//*[@id='menu-item-24']/a")
    private WebElementFacade facebookAgibank;
    @FindBy(xpath = "//*[@id='menu-item-26']/a")
    private WebElementFacade instragamAgibank;
    @FindBy(xpath = "//*[@id='menu-item-2696']/a")
    private WebElementFacade linkedinAgibank;

    @FindBy(id = "menu-item-2690")
    private WebElementFacade linkInstitucional;
    @FindBy(id = "menu-item-584")
    private WebElementFacade linkProduto;
    @FindBy(id = "menu-item-583")
    private WebElementFacade linkServicos;
    @FindBy(id = "menu-item-2684")
    private WebElementFacade linkSuasFinancas;
    @FindBy(id = "menu-item-572")
    private WebElementFacade linkSuaSeguranca;
    @FindBy(id = "menu-item-579")
    private WebElementFacade linkSuaCarreira;
    @FindBy(id = "menu-item-2695")
    private WebElementFacade linkInscrevaSe;
    @FindBy(id = "menu-item-570")
    private WebElementFacade linkSeusInvestimentos;
    @FindBy(xpath = "//button[contains(text(),'Assinar')]")
    private WebElementFacade botaoPostMaisAntigo;

    @FindBy(xpath = "//*[contains(text(),'Assinar blog por e-mail')]")
    private WebElementFacade assinarBlogEmail;
    @FindBy(xpath = "//*[contains(text(),'Digite seu endereço de e-mail para assinar este blog e receber notificações de novas publicações por e-mail.')]")
    private WebElementFacade textoInformarivo;
    @FindBy(id = "subscribe-field")
    private WebElementFacade inputEmail;
    @FindBy(xpath = "//button[contains(text(),'Assinar')]")
    private WebElementFacade botaoAssinar;

    public boolean getVisualizarElementosIcones() throws Exception {
        return lupaPesquisa.isVisible()
                && logoTelaBlogAgibank.isVisible()
                && facebookAgibank.isVisible()
                && instragamAgibank.isVisible()
                && linkedinAgibank.isVisible()
                && botaoPostMaisAntigo.isVisible();
    }

    public boolean getVisualizarElementosMenus() throws Exception {
        return linkInstitucional.isVisible()
                && linkProduto.isVisible()
                && linkServicos.isVisible()
                && linkSuasFinancas.isVisible()
                && linkSuaSeguranca.isVisible()
                && linkSuaCarreira.isVisible()
                && linkInscrevaSe.isVisible()
                && linkSeusInvestimentos.isVisible();
    }

    public boolean getVisualizarElementoAssinarBlog() throws Exception {
        return assinarBlogEmail.isVisible()
                && textoInformarivo.isVisible()
                && inputEmail.isVisible()
                && botaoAssinar.isVisible();
    }
}
