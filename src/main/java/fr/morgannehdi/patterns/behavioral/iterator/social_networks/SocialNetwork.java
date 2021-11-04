package fr.morgannehdi.patterns.behavioral.iterator.social_networks;

import fr.morgannehdi.patterns.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}