package fr.morgannehdi.patterns.behavioral.mediator.components;

import fr.morgannehdi.patterns.behavioral.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}