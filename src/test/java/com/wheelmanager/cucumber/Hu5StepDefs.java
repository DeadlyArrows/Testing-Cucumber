package com.wheelmanager.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.MyWebDriver;

public class Hu5StepDefs {
    public static WebDriver webDriver;

    public Hu5StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @When("El usuario selecciona el botón Update")
    public void elUsuarioSeleccionaElBotónUpdate() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-list-subscription[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[2]")).click();
    }

    @Then("El usuario rellena los datos de su nueva suscripción")
    public void elUsuarioRellenaLosDatosDeSuNuevaSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Freeflix");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("05/12/2018");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("25");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("4");
    }

    @When("El usuario guarda la nueva suscripción")
    public void elUsuarioGuardaLaNuevaSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
    }

    @Then("El sistema lo redirige a la vista Home")
    public void elSistemaLoRedirigeALaVistaHome() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/a[1]")).click();
    }

    @Then("El usuario rellena parcialmente los datos de su nueva suscripción")
    public void elUsuarioRellenaParcialmenteLosDatosDeSuNuevaSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-subscription[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Freeflix");
    }

    @When("El usuario cambia de opinión y se redirige a la vista Ver Suscripción")
    public void elUsuarioCambiaDeOpiniónYSeRedirigeALaVistaVerSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/ul[1]/li[1]/a[1]")).click();
    }
}
