package com.wheelmanager.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.MyWebDriver;

public class Hu8Stepdefs {

    public static WebDriver webDriver;

    public Hu8Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("El usuario busca en sección promociones")
    public void elUsuarioBuscaEnSecciónPromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
    }

    @Then("El sistema muestra las promociones ingresadas")
    public void elSistemaMuestraLasPromocionesIngresadas() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario ingresa a la sección añadir promociones")
    public void elUsuarioIngresaALaSecciónAñadirPromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();

    }

    @Then("El sistema muestra la vista de añadir promoción")
    public void elSistemaMuestraLaVistaDeAñadirPromoción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[3]/a[1]")).click();
    }

    @When("El usuario ingresa los datos para la nueva promocion")
    public void elUsuarioIngresaLosDatosParaLaNuevaPromocion() {
        //        Name
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Black Friday");
        //        Description
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("Ofertas");
        //        ImageUrl
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")).sendKeys("https://peru21.pe/resizer/U_WM2r4kKryO4aN-ahl7z7DrfUM=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/UXXANMEBMZCJDLL3FJUQAZBDGU.jpg");
        //        Offer Start Date
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]")).sendKeys("21/02/2013");
        //        Offer End Date
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[6]/div[1]/input[1]")).sendKeys("05/05/2012");
        //        Offer Price
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[7]/div[1]/input[1]")).sendKeys("27");
        //        Click
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[8]/button[1]")).click();
    }

    @Then("El sistema muestra la nueva promoción")
    public void elSistemaMuestraLaNuevaPromoción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario desiste de añadir nueva promoción")
    public void elUsuarioDesisteDeAñadirNuevaPromoción() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
    }

    @Then("El sistema vuelve a la vista de promociones")
    public void elSistemaVuelveALaVistaDePromociones() {
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
    }

    @When("El usuario ingresa datos incorrectos para la nueva promoción")
    public void elUsuarioIngresaDatosIncorrectosParaLaNuevaPromoción() {
        //        Name
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Black Friday");
        //        Description
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("");
        //        ImageUrl
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")).sendKeys("");
        //        Offer Start Date
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]")).sendKeys("asdf");
        //        Offer End Date
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[6]/div[1]/input[1]")).sendKeys("sdfgh");
        //        Offer Price
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[7]/div[1]/input[1]")).sendKeys("27");
        //        Click
        webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-create-offer[1]/div[1]/div[1]/form[1]/div[8]/button[1]")).click();
    }
}
