package com.skillsup.springWithJavaConfig.service;

import com.skillsup.springWithJavaConfig.Contact;
import com.skillsup.springWithJavaConfig.dao.ContactsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    private ContactsDao contacts;

    @Value("${maxSize}")
    private int maxSize;

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ContactsDao getContacts() {
        return contacts;
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