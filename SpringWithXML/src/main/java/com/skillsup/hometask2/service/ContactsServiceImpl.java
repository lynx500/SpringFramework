package com.skillsup.hometask2.service;

import com.skillsup.hometask2.Contact;
import com.skillsup.hometask2.dao.ContactsDao;
import com.skillsup.hometask2.service.ContactsService;

import java.util.List;

public class ContactsServiceImpl implements ContactsService {

    private ContactsDao contacts;
    private int maxSize;

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


    public void setContacts(ContactsDao contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getAllContacts() {
        return contacts.getAllContacts();
    }

    @Override
    public void addContact(Contact contact) {
        if(contacts.getAllContacts().size()<maxSize) {
            contacts.addContact(contact);
        } else {
            System.out.println("Not enough memory. Please, delete some contacts!");
        }
    }

    @Override
    public void deleteContact(Contact contact) {
        contacts.deleteContact(contact);
    }

    @Override
    public void clearAll() {
        contacts.clearAll();
    }
}
