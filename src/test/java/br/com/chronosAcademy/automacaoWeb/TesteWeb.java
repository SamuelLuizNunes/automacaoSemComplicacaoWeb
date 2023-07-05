package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driverWeb.getDriver().get("https://www.chronosacademy.com.br/");
    }

    @After
    public void finalizaTeste(){
        driverWeb.getDriver().quit();
    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driverWeb.getDriver().findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }
}
