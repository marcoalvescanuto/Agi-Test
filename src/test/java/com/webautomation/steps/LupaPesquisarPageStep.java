package com.webautomation.steps;

import static org.assertj.core.api.Assertions.assertThat;
import com.webautomation.actions.LupaPesquisarPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LupaPesquisarPageStep {

  @Steps
  LupaPesquisarPageActions lupaPesquisarPageActions;

  @Given("clico na lupa para fazer as buscas no blog")
  public void clickOnRegistrarNovoContatoAgendamento() throws Exception {
    lupaPesquisarPageActions.clicarLupaDePesquisa();
    Thread.sleep(1000);
  }

  @When("deve abrir um campo de pesquisa e aparece o botão pesquisar")
  public void verificarElementosPesquisa() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarElementosPesquisa()).isTrue();
    Thread.sleep(1000);
  }

  @And("preencho o campo com termo {string} e clico no botao pesquisar")
  public void preencherCampoPesquisa(String texto) throws Exception {
    lupaPesquisarPageActions.preencherCampoEClicarBtnPesquisar(texto);
    Thread.sleep(1000);
  }

  @And("a mensagem de resultados da busca deve conter o termo de busca agibank")
  public void verificarElementosBusca() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarResultadoDaPesquisa()).isTrue();
    assertThat(lupaPesquisarPageActions.validarElementoAleatorioVisivel()).isTrue();
    Thread.sleep(500);
  }

  @And("a mensagem de resultados da busca deve conter o termo de Nenhum resultado")
  public void verificarElementosBuscaErro() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarResultadoDaPesquisaErro()).isTrue();
    Thread.sleep(500);
  }

  @And("clicar no botao de pesquisa sem preencher o campo")
  public void naoPreencherCampoPesquisa() throws Exception {
    lupaPesquisarPageActions.naoPreencherCampoEClicarBtnPesquisar();
    Thread.sleep(1000);
  }

  @And("a mensagem de resultados da busca deve fitrar todos os resultados abordando todos os temas do blog")
  public void visualizarResultadoCampoNaoPreenchido() throws Exception {
    lupaPesquisarPageActions.visualizarResultadoDaPesquisaNaoPreenchido();
    Thread.sleep(1000);
  }

  @And("validar elementos na pagina")
  public void validarElementoAleatorio() throws Exception {
    assertThat(lupaPesquisarPageActions.validarElementoAleatorioVisivel()).isTrue();
    lupaPesquisarPageActions.clicarBotaoProximaPagina();
    Thread.sleep(000);
  }

  @And("accessar a tela do blog e fazer pesquisas na lupa termo com caracates especiais")
  public void visualizarResultadoDaPesquisaCaractresEspeciais() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarResultadoDaPesquisaCaractresEspeciais()).isTrue();
    Thread.sleep(500);
  }

  @And("accessar a tela do blog e fazer pesquisas na lupa termo com espaçamentos")
  public void visualizarResultadoDaPesquisaComEspacos() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarResultadoDaPesquisaComEspacos()).isTrue();
    Thread.sleep(500);
  }

  @And("clicar no link apos a pesquisa")
  public void clicarLinkDaPesquisa() throws Exception {
    lupaPesquisarPageActions.clicarNoLinkDaPesquisa();
    Thread.sleep(1000);
  }

  @And("apos fazer a pesquisa clicar na pagina para ser direcionado para outra pagina")
  public void visualizarEClicarBtnPRoximaPagina() throws Exception {
    assertThat(lupaPesquisarPageActions.visualizarBotaoProximaPagina()).isTrue();
    lupaPesquisarPageActions.clicarBotaoProximaPagina();
    assertThat(lupaPesquisarPageActions.visualizarResultadoDaPesquisa()).isTrue();
    Thread.sleep(3000);
  }
}
