package com.skillsup.springWithJavaConfig;

import com.skillsup.springWithJavaConfig.config.AppContext;
import com.skillsup.springWithJavaConfig.service.ContactsService;
import com.skillsup.springWithJavaConfig.service.ContactsServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        ContactsService service = context.getBean(ContactsService.class);
        System.out.println(service.getAllContacts());
        Contact c1 = new Contact("Robert Renaud", 6541);
        Contact c2 = new Contact("Lora Ashley", 5412);

        //add 2 new contacts and show the list
        service.addContact(c1);
        service.addContact(c2);

        //delete 1 of contacts in order to put another
        service.deleteContact(service.getAllContacts().get(0));
        service.addContact(c2);
        System.out.println(service.getAllContacts());


    }
}
