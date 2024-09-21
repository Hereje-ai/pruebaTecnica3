package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.CartShopPage.BTN_BUYAGAIN;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GoBuyAgain implements Task {
    public static GoBuyAgain choose() {
        return Tasks.instrumented(GoBuyAgain.class);
    }

    @Override
    @Step("{0} selecciona la opcIón de seguir comprando")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_BUYAGAIN, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_BUYAGAIN));
    }

}
