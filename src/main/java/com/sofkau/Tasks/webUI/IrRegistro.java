package com.sofkau.Tasks.webUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.webUI.IrRegistro.BOTON_REGISTRO;
import static com.sofkau.ui.webUI.RegistroUsuario.*;

public class IrRegistro implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //  WaitUntil.the(CAMPO_NOMBRE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REGISTRO)


        );

    }

    public static IrRegistro irRegistro() {
        return new IrRegistro();
    }


}
