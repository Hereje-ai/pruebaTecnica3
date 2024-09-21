package co.com.serenity.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.AgradecimientosPage.*;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class ChooseOptionShop implements Task {
    private String numberRandomOption;

    public static ChooseOptionShop withParams(String numberRandomOption) {
        return Tasks.instrumented(ChooseOptionShop.class, numberRandomOption);
    }

    @Override
    @Step("{0} Selecciona aleatoriamente la posicion #numberRandomBtn de la subfuncion de elementos")
    public <T extends Actor> void performAs(T actor) {
        String number = numberRandomOption;

        actor.attemptsTo(
                MoveMouse.to(ITEM.of(number)), // Mueve el mouse al elemento que muestra el botón
                // Espera hasta que el botón esté visible y luego haz clic
                WaitUntil.the(BTN_ADDCART_ITEM.of(number), isVisible()).forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(BTN_ADDCART_ITEM.of(number))
        );
    }
}
