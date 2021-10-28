package com.wheelmanager.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.MyWebDriver;

public class Hu9Stepdefs {

    public static WebDriver webDriver;

    public Hu9Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario ingresa en la sección promociones")
    public void elUsuarioIngresaEnLaSecciónPromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
    }

    @Then("El sistema muestra la vista de promociones")
    public void elSistemaMuestraLaVistaDePromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario ingresa a la sección editar promociones")
    public void elUsuarioIngresaALaSecciónEditarPromociones() {
        WebDriverWait wait = new WebDriverWait(webDriver, 2);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-list-offer[1]/div[1]/table[1]/tbody[1]/tr[5]/td[7]/div[1]/button[2]")));
        element.click();
    }

    @Then("El usuario edita los datos para la promocion")
    public void elUsuarioEditaLosDatosParaLaPromocion() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).clear();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Bicicletas Sport");
    }


    @And("El sistema muestra la promoción editada")
    public void elSistemaMuestraLaPromociónEditada() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
    }

    @Then("El sistema muestra la vista de editar promoción")
    public void elSistemaMuestraLaVistaDeEditarPromoción() {

        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-list-offer[1]/div[1]/table[1]/tbody[1]/tr[5]/td[7]/div[1]/button[2]")).click();
    }

    @When("El usuario desiste de editar la promoción")
    public void elUsuarioDesisteDeEditarLaPromoción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
    }

    @Then("El sistema vuelve a la vista de las promociones")
    public void elSistemaVuelveALaVistaDeLasPromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario edita con datos incorrectos la promocion")
    public void elUsuarioEditaConDatosIncorrectosLaPromocion() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).clear();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("");
    }

    @Then("El sistema no edita la promoción")
    public void elSistemaNoEditaLaPromoción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-update-offer[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
    }
}
