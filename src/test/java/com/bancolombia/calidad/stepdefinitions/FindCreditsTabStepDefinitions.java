package com.bancolombia.calidad.stepdefinitions;

import com.bancolombia.calidad.questions.Validacion;
import com.bancolombia.calidad.tasks.OpenThe;
import com.bancolombia.calidad.userinterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class FindCreditsTabStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor personaNatural = Actor.named("keco");



    @Given("que estoy en la pagina principal de la sucursal virtual personas de bancolombia")
    public void pagPrincipal(){
        driver.manage().window().maximize();
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @When("accedo a la ventana de simulacion de creditos e ingreso la informacion necesaria")
    public void accederYSimularCredito(){

        personaNatural.attemptsTo(OpenThe.Browser(new UserPage()));
    }

    @Then("puedo ver las opciones de pago segun la informacion ingresada")
    public void verSimulacion(){
        personaNatural.should(seeThat(Validacion.finSimulacion(), equalTo(true)));
    }
}
