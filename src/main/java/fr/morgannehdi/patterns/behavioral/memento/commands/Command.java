package fr.morgannehdi.patterns.behavioral.memento.commands;

public interface Command {
    String getName();

    void execute();
}