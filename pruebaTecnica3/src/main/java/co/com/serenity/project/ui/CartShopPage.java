package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class CartShopPage extends PageObject {
    public static final Target BTN_BUYAGAIN = Target.the("botón para ir a la página de inicio").located(By.xpath("//a[normalize-space()='Seguir comprando']"));
    public static final Target TABLE_ITEMS = Target.the("tabla las opciones de compra añadidas al carrito").located(By.xpath("//ol[@class='breadcrumb']"));
}
