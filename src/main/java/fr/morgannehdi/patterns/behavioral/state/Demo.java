package fr.morgannehdi.patterns.behavioral.state;

import fr.morgannehdi.patterns.behavioral.state.ui.Player;
import fr.morgannehdi.patterns.behavioral.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}