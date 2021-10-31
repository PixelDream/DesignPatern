package fr.morgannehdi.patterns.creational.abstractfactory.app;

import fr.morgannehdi.patterns.creational.abstractfactory.buttons.Button;
import fr.morgannehdi.patterns.creational.abstractfactory.checkboxes.Checkbox;
import fr.morgannehdi.patterns.creational.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}