package com.skillsup.springWithJavaConfig.dao;

import com.skillsup.springWithJavaConfig.Contact;

import java.util.*;

public interface ContactsDao {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}