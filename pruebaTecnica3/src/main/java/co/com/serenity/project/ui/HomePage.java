package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomePage extends PageObject {
    public static final Target BTN_AGRADECIMIENTOS = Target.the("Boton categoria AGRADECIMIENTOS").located(By.xpath("//a[@href='https://www.floristeriamundoflor.com/product-category/agradecimientos/'][normalize-space()='Agradecimientos']"));
}
