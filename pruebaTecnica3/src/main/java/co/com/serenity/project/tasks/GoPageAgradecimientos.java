package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.HomePage.BTN_AGRADECIMIENTOS;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GoPageAgradecimientos implements Task {
    public static GoPageAgradecimientos choose() {
        return Tasks.instrumented(GoPageAgradecimientos.class);
    }

    @Override
    @Step("{0} selecciona la opción de agradecimientos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_AGRADECIMIENTOS, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_AGRADECIMIENTOS));
    }

}
