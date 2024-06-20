package com.demoblaze.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePagesObjects extends PageObject {
    By btnLogin = By.id("login2");
    By txtUsuario = By.id("loginusername");
    By txtClave = By.id("loginpassword");
    By btnIniciar = By.xpath("//button[contains(text(), 'Log in')]");
    By txtBienvenida = By.id("nameofuser");

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciar() {
        return btnIniciar;
    }

    public By getTxtBienvenida() {
        return txtBienvenida;
    }

}
