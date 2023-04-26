package com.webautomation.actions;

import com.webautomation.pages.LupaPesquisarPage;
import net.thucydides.core.annotations.Step;

public class LupaPesquisarPageActions {
    private LupaPesquisarPage lupaPesquisarPage;

    @Step
    public void clicarLupaDePesquisa() {
        lupaPesquisarPage.clicarLupaPesquisa();
    }

    @Step
    public boolean visualizarElementosPesquisa() throws Exception {
        return lupaPesquisarPage.getVisualizarElementosPesquisar();
    }

    @Step
    public void preencherCampoEClicarBtnPesquisar(String texto) {
        lupaPesquisarPage.preencherEClicarBtnPesquisar(texto);
    }

    @Step
    public boolean visualizarResultadoDaPesquisa() throws Exception {
        return lupaPesquisarPage.getVisualizarResultadoDaPesquisa();
    }

    @Step
    public boolean visualizarResultadoDaPesquisaErro() throws Exception {
        return lupaPesquisarPage.getVisualizarResultadoDaPesquisaErro();
    }

    @Step
    public void naoPreencherCampoEClicarBtnPesquisar() {
        lupaPesquisarPage.naoPreencherEClicarBtnPesquisar();
    }

    @Step
    public boolean visualizarResultadoDaPesquisaNaoPreenchido() throws Exception {
        return lupaPesquisarPage.getVisualizarResultadoDaPesquisaNaoPreenchido();
    }

    @Step
    public void clicarBotaoProximaPagina() {
        lupaPesquisarPage.clicarBotaoProximaPagina(lupaPesquisarPage);
    }

    @Step
    public boolean visualizarBotaoProximaPagina() throws Exception {
        return lupaPesquisarPage.getBotaoProximaPagina();
    }

    @Step
    public boolean validarElementoAleatorioVisivel() {
        return lupaPesquisarPage.validarElementoAleatorioVisivel();
    }

    @Step
    public boolean visualizarResultadoDaPesquisaCaractresEspeciais() throws Exception {
        return lupaPesquisarPage.getVisualizarResultadoDaPesquisaCaractresEspeciais();
    }

    @Step
    public boolean visualizarResultadoDaPesquisaComEspacos() throws Exception {
        return lupaPesquisarPage.getvisualizarResultadoDaPesquisaComEspacos();
    }

    @Step
    public void clicarNoLinkDaPesquisa() {
        lupaPesquisarPage.clicarLinkDaPesquisa();
    }
}
