package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class AgradecimientosPage extends PageObject {
    public static final Target BTN_ADDCART_ITEM = Target.the("Boton de añadir al carrito de cada opcion de compra").locatedBy("(//a[@class=' button product_type_simple add_to_cart_button ajax_add_to_cart product_type_simple'])[{0}]");
    public static final Target ITEM = Target.the("Fotografia opción de compra").locatedBy("(//img[@class='image-no-effect unveil-image'])[{0}]");
}
