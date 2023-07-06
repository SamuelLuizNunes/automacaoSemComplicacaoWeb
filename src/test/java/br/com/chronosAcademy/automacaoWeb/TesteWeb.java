package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TesteWeb {
    Driver driver;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driver = new Driver("chrome");
        driver.getDriver().get("https://www.chronosacademy.com.br/");
        principalPage = new PrincipalPage(driver.getDriver());
        cursoPage = new CursoPage(driver.getDriver());
    }

    @After
    public void finalizaTeste(){
        driver.getDriver().quit();
    }

    @Test
    public void primeiroTeste(){
        assertEquals("Porque Tempo É Conhecimento.", principalPage.getTitulo());
    }

    @Test
    public void segundoTeste(){
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos.", cursoPage.getTitulo2());
    }

}
