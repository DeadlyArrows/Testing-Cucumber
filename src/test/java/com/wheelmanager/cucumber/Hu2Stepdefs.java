package com.wheelmanager.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.MyWebDriver;

public class Hu2Stepdefs {
    public static WebDriver webDriver;

    public Hu2Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }


    @Given("El usuario se encuentra en la vista Homes")
    public void elUsuarioSeEncuentraEnLaVistaHomes() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/a[1]")).click();
    }

    @Then("El sistema muestra los vehículos a rentars")
    public void elSistemaMuestraLosVehículosARentars() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario busca por nombre el vehículo de su interéss")
    public void elUsuarioBuscaPorNombreElVehículoDeSuInteréss() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle[1]/div[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("Goliat");
    }

    @Then("El sistema muestra los resultados de la búsqueda por nombres")
    public void elSistemaMuestraLosResultadosDeLaBúsquedaPorNombres() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
    }

    @When("El usuario busca por marca los diferentes tipos de vehículoss")
    public void elUsuarioBuscaPorMarcaLosDiferentesTiposDeVehículoss() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-brand[1]/div[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("BMC");
    }

    @Then("El sistema muestra los resultados de la búsqueda por marcas")
    public void elSistemaMuestraLosResultadosDeLaBúsquedaPorMarcas() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-brand[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
    }

    @When("El usuario busca el vehículo de su interés por tipo de vehículos")
    public void elUsuarioBuscaElVehículoDeSuInterésPorTipoDeVehículos() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle-type[1]/div[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("Bicicleta");
    }

    @Then("El sistema muestra los resultados de la búsqueda por tipo de vehículos")
    public void elSistemaMuestraLosResultadosDeLaBúsquedaPorTipoDeVehículos() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle-type[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
    }

    @When("El usuario busca el vehículo de su interéss")
    public void elUsuarioBuscaElVehículoDeSuInteréss() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[5]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle[1]/div[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("ASDFGFD");
    }

    @Then("El sistema no muestra ningún resultado de la búsqueda realizadas")
    public void elSistemaNoMuestraNingúnResultadoDeLaBúsquedaRealizadas() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-find-vehicle[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
    }
}
