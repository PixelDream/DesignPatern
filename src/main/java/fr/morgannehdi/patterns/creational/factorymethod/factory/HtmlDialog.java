package fr.morgannehdi.patterns.creational.factorymethod.factory;

import fr.morgannehdi.patterns.creational.factorymethod.buttons.Button;
import fr.morgannehdi.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}