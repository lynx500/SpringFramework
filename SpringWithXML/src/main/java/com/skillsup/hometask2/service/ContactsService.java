package com.skillsup.hometask2.service;

import com.skillsup.hometask2.Contact;

import java.util.List;

public interface ContactsService {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
