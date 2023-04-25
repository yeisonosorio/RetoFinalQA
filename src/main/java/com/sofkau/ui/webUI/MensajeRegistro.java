package com.sofkau.ui.webUI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MensajeRegistro extends PageObject {

    public static final Target MENSAJE_REGISTRO = Target.the("nombre cliente")
            .located(By.xpath("//*[@class='swal2-html-container'][1]"));




}
