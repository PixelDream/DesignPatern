package fr.morgannehdi.patterns.creational.factorymethod.factory;

import fr.morgannehdi.patterns.creational.factorymethod.buttons.Button;
import fr.morgannehdi.patterns.creational.factorymethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}