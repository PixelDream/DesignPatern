package fr.morgannehdi.patterns.creational.abstractfactory.factories;

import fr.morgannehdi.patterns.creational.abstractfactory.buttons.Button;
import fr.morgannehdi.patterns.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}