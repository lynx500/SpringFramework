package com.skillsup.springWithAnnotations.dao;

import com.skillsup.springWithAnnotations.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class ContactsDaoImpl implements ContactsDao {

    @Autowired
    private List<Contact> allContacts;

    @Value("${maxSize}")
    private int maxSize;

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

    @PostConstruct
    private void checkSize() {
        if (allContacts.size() >= maxSize) {
            allContacts.remove(0);
        }
    }
}

