package com.skillsup.hometask2.dao;

import com.skillsup.hometask2.Contact;

import java.util.*;

public interface ContactsDao {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
