package com.skillsup.springWithAnnotations.service;

import com.skillsup.springWithAnnotations.Contact;
import com.skillsup.springWithAnnotations.dao.ContactsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
//   @Resource(name = "contactsDao")
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
