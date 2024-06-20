package com.demoblaze.steps;

import com.demoblaze.pages.HomePagesObjects;
import com.demoblaze.utils.ReadExcel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.hamcrest.Matchers;

import java.io.IOException;

public class HomepageSteps {
    HomePagesObjects homePagesObjects = new HomePagesObjects();
    ReadExcel data = new ReadExcel();

    @Step
    public void openBrowser() {
        homePagesObjects.open();
    }

    @Step
    public void insertUsername() throws IOException {
        homePagesObjects.getDriver().findElement(homePagesObjects.getBtnLogin()).click();
        homePagesObjects.getDriver().findElement(homePagesObjects.getTxtUsuario())
                .sendKeys(data.readDataExcel("Data/data.xlsx", "Login", 1, 0));
    }

    @Step
    public void insertPassword() throws IOException {
        homePagesObjects.getDriver().findElement(homePagesObjects.getTxtClave())
                .sendKeys(data.readDataExcel("Data/data.xlsx", "Login", 1, 1));
        homePagesObjects.getDriver().findElement(homePagesObjects.getBtnIniciar()).click();
    }

    @Step
    public void validation() {
        Assert.assertThat(homePagesObjects.getDriver()
                .findElement(homePagesObjects.getTxtBienvenida()).isDisplayed(), Matchers.is(true));
    }

}
