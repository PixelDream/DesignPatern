package fr.morgannehdi.patterns.behavioral.iterator.iterators;

import fr.morgannehdi.patterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}