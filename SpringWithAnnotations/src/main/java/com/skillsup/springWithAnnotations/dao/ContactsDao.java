package com.skillsup.springWithAnnotations.dao;

import com.skillsup.springWithAnnotations.Contact;

import java.util.*;

public interface ContactsDao {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}

