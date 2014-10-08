package com.skillsup.springWithAnnotations;

import com.skillsup.springWithAnnotations.service.ContactsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ContactsService service = context.getBean(ContactsService.class);
        System.out.println(service.getAllContacts());

        Contact c1 = new Contact();
        c1.setFullName("Robert Renaud");
        c1.setPhone(451421);
        Contact c2 = new Contact();
        c2.setFullName("Lora Ashley");
        c2.setPhone(777);

        //add 2 new contacts and show the list
        service.addContact(c1);
        service.addContact(c2);

        //delete 1 of contacts in order to put another
        service.deleteContact(service.getAllContacts().get(0));
        service.addContact(c2);
        System.out.println(service.getAllContacts());

    }
}
