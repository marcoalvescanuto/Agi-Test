package com.webautomation.actions;

import com.webautomation.pages.HomeAgiPage;
import net.thucydides.core.annotations.Step;

public class HomeAgiPageActions {
    private HomeAgiPage homeAgiPage;

    public HomeAgiPageActions() {
        homeAgiPage = new HomeAgiPage();
    }

    public void openHomePage() throws Exception {
        homeAgiPage.open();
    }

    @Step
    public boolean visualizarElementosIcones() throws Exception {
        return homeAgiPage.getVisualizarElementosIcones();
    }

    @Step
    public boolean visualizarElementosMenus() throws Exception {
        return homeAgiPage.getVisualizarElementosMenus();
    }

    @Step
    public boolean visualizarElementoAssinarBlog() throws Exception {
        return homeAgiPage.getVisualizarElementoAssinarBlog();
    }
}
