package com.skillsup.springWithAnnotations.service;

import com.skillsup.springWithAnnotations.Contact;

import java.util.List;

public interface ContactsService {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();

}