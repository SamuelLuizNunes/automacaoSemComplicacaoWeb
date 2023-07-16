package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(id = "menuUserLink")
    public WebElement btnLogin;
    public WebElement btnFechar;
    public WebElement divFecharModal;
    public WebElement inpUserName;
    public WebElement inpPassword;
    public WebElement btnSignIn;
    public WebElement inpRemember;
    public WebElement linkCreateAccount;

}
