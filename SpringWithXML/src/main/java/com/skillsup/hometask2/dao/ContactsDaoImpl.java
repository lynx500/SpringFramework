package com.skillsup.hometask2.dao;

import com.skillsup.hometask2.Contact;

import java.util.List;

public class ContactsDaoImpl implements ContactsDao{

    private List<Contact> allContacts;

    public void setAllContacts(List<Contact> allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public void addContact(Contact contact) {
        allContacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        allContacts.remove(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return allContacts;
    }

    @Override
    public void clearAll() {
        allContacts.clear();
    }
}
