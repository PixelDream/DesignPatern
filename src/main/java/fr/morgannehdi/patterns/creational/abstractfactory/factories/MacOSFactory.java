package fr.morgannehdi.patterns.creational.abstractfactory.factories;

import fr.morgannehdi.patterns.creational.abstractfactory.buttons.Button;
import fr.morgannehdi.patterns.creational.abstractfactory.buttons.MacOSButton;
import fr.morgannehdi.patterns.creational.abstractfactory.checkboxes.Checkbox;
import fr.morgannehdi.patterns.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}