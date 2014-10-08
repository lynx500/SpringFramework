package com.skillsup.hometask2;

import com.skillsup.hometask2.dao.ContactsDao;
import com.skillsup.hometask2.dao.ContactsDaoImpl;
import com.skillsup.hometask2.service.ContactsService;
import com.skillsup.hometask2.service.ContactsServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ContactsService allContacts = (ContactsService) context.getBean("contacts");
        System.out.println(allContacts.getAllContacts());
//        System.out.println(String.valueOf(allContacts.getMaxSize()));
        Contact c1 = new Contact();
        c1.setFullName("Robert Renaud");
        c1.setPhone(451421);
        Contact c2 = new Contact();
        c2.setFullName("Lora Ashley");
        c2.setPhone(777);

        //add 2 new contacts and show the list
        allContacts.addContact(c1);
        allContacts.addContact(c2);
        System.out.println(allContacts.getAllContacts());

        //delete 1 of contacts in order to put another
        allContacts.deleteContact(c1);
        allContacts.addContact(c2);
        System.out.println(allContacts.getAllContacts());
    }
}
