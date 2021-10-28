package com.wheelmanager.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.MyWebDriver;

public class Hu3Stepdefs {
    public static WebDriver webDriver;

    public Hu3Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario selecciona el botón nueva suscripciósn")
    public void elUsuarioSeleccionaElBotónNuevaSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/a[1]")).click();
    }

    @Then("El sistema lo redirecciona a la vista Nueva Suscripcións")
    public void elSistemaLoRedireccionaALaVistaNuevaSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/ul[1]/li[3]/a[1]")).click();
    }

    @When("El usuario rellena sus datos en todos los campos de suscripcións")
    public void elUsuarioRellenaSusDatosEnTodosLosCamposDeSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-subscription[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Freetify");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-subscription[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("20/07/2020");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-subscription[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")).sendKeys("15");
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-subscription[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]")).sendKeys("3");
    }

    @When("El usuario selecciona registrar su suscripcións")
    public void elUsuarioSeleccionaRegistrarSuSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-subscription[1]/div[1]/div[1]/form[1]/div[6]/button[1]")).click();
    }

    @Then("El usuario ya está suscritos")
    public void elUsuarioYaEstáSuscrito() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/a[1]")).click();
    }

    @When("El usuario selecciona el botón ver suscripcións")
    public void elUsuarioSeleccionaElBotónVerSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/a[1]")).click();
    }

    @Then("El sistema lo redirecciona a la vista Ver Suscripcións")
    public void elSistemaLoRedireccionaALaVistaVerSuscripción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/ul[1]/li[1]/a[1]")).click();

    }

    @Then("El sistema muestra todas las suscripciones disponibless")
    public void elSistemaMuestraTodasLasSuscripcionesDisponibles() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[13]/ul[1]/li[1]/a[1]")).click();
    }
}
