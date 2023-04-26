package com.webautomation.steps;

import static org.assertj.core.api.Assertions.assertThat;
import com.webautomation.actions.HomeAgiPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeAgiPageStep {

  @Steps
  HomeAgiPageActions homeAgiPageActions;

  @Given("estou na home page do blog agibank")
  public void openHomePage() throws Exception {
    homeAgiPageActions.openHomePage();
    Thread.sleep(1000);
  }

  @When("estou na tela do blog e visulizo os elementos de icones")
  public void verificarElementosIcones() throws Exception {
    assertThat(homeAgiPageActions.visualizarElementosIcones()).isTrue();
    Thread.sleep(500);
  }

  @And("estou na tela do blog e visulizo os elementos de Menus")
  public void visualizarElementosMenus() throws Exception {
    assertThat(homeAgiPageActions.visualizarElementosMenus()).isTrue();
    Thread.sleep(500);
  }

  @Then("estou na tela do blog e visulizo os elementos de Blog")
  public void visualizoElementosMenus() throws Exception {
    assertThat(homeAgiPageActions.visualizarElementoAssinarBlog()).isTrue();
    Thread.sleep(500);
  }
}